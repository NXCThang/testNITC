package Controller.Singleton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.BankDatabase;
import Model.DepositSlot;
import Model.Transaction;
import View.Keypad;
import View.Screen;

public class Deposit extends Transaction {
	private double amount;
	private Keypad keypad;
	private DepositSlot depositSlot;
	private final static int CANCELED = 0;

	public Deposit(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad,
			DepositSlot atmDepositSlot) {

		super(userAccountNumber, atmScreen, atmBankDatabase);

		keypad = atmKeypad;
		depositSlot = atmDepositSlot;
	}

	public void execute() {
		promptForDepositAmount();
	}

	public void makedeposit(double amount) {
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();

		if (amount != CANCELED) {
			screen.messageJLabel2.setText("\nPlease insert a deposit envelope containing " + amount);

			boolean envelopeReceived = depositSlot.isEnvelopeReceived();

			if (envelopeReceived) {
				screen.messageJLabel2
						.setText("\nYour envelope has been received.\n");
				bankDatabase.credit(getAccountNumber(), amount);
			} else {
				screen.messageJLabel2
						.setText("\nYou did not insert an envelope, so the ATM has canceled your transaction.");
			}
		} else {
			screen.messageJLabel2.setText("\nCanceling transaction...");
		}
	}

	private void promptForDepositAmount() {

		Screen screen = getScreen();
		screen.createDepositGUI();
		screen.Mainframe.add(keypad.addkeypad(), BorderLayout.CENTER);
		Depositcheck check1 = new Depositcheck();
		keypad.BEnter.addActionListener(check1);
		screen.Mainframe.revalidate();

	}

	private class Depositcheck implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			double input = Integer.parseInt(screen.Inputfield2.getText());
			double amount = input;

			makedeposit(amount);

		}
	}
}
