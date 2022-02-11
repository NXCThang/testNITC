package Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Screen;

public class BalanceInquiry extends Transaction {

	public BalanceInquiry(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
		super(userAccountNumber, atmScreen, atmBankDatabase);
	}

	public void execute() {

		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();

		double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());

		double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());

		screen.createBalanceGUI();
		screen.messageJLabel2.setText("Available Balance: " + availableBalance);
		screen.messageJLabel3.setText("Total Balance: " + totalBalance);
		screen.Mainframe.revalidate();

	}

}
