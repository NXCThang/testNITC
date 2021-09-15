package SvaP;

import java.util.Scanner;

public class Square extends Number {
	double[] canh = new double[1];
	public void input() {
		Scanner in = new Scanner(System.in);
		for(int i=0;i<1;i++) {
			System.out.println("Nhập cạnh thứ "+(i+1)+": ");
			Numberofsize = in.nextDouble();
			canh[i]= Numberofsize;
		}
	}
	
	public double P() {
		return canh[0]*4;
	}
	
	public double S() {
		return canh[0]*canh[0];
	}
	
	public void inP() {
		System.out.println("Chu vi hình vuông là: "+P());
	}
	public void inS(){
		System.out.println("Diện tích hình vuông là: "+ S());
	}
}
