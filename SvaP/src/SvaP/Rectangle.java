package SvaP;

import java.util.Scanner;

public class Rectangle extends Number{
	double[] canh = new double[2];
	public void input() {
		Scanner in = new Scanner(System.in);
		for(int i=0;i<1;i++) {
			System.out.println("Nhập cạnh thứ "+(i+1)+": ");
			Numberofsize = in.nextDouble();
			canh[i]= Numberofsize;
		}
	}
	
	public double P() {
		return (canh[0]+canh[1])*2;
	}
	
	public double S() {
		return canh[0]*canh[1];
	}
	
	public void inP() {
		System.out.println("Chu vi hình chữ nhật là: "+P());
	}
	public void inS(){
		System.out.println("Diện tích hình chữ nhật là: "+ S());
	}
}
