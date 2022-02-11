package Controller.MainProgram;

import Controller.Singleton.ATM;

public class ATMCaseStudy {

	public static void main(String[] args) {

		ATM theATM = ATM.getinstance();

		theATM.run();
	}
}
