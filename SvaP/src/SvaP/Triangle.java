package SvaP;

import java.util.Scanner;

public class Triangle extends Number {
	double[] canh = new double[3];
	public void input() {
		Scanner in = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Nhập cạnh thứ "+(i+1)+": ");
			Numberofsize = in.nextDouble();
			canh[i]= Numberofsize;
		}
	}
	
	public double P() {
		return canh[0]+canh[1]+canh[2];
	}
	
	public double S() {
		double p=P()/2;
		return Math.sqrt(p*(p-canh[0])*(p-canh[1])*(p-canh[2]));
	}
	
	public void inP() {
		System.out.println("Chu vi hình tam giác là: "+P());
	}
	public void inS(){
		System.out.println("Diện tích hình tam giác là: "+ S());
	}
}
