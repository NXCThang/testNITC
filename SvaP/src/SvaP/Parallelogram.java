package SvaP;

import java.util.Scanner;

public class Parallelogram extends Number {
	double[] canh = new double[3];
	public void input() {
		Scanner in = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			System.out.println("Nhập cạnh thứ "+(i+1)+": ");
			Numberofsize = in.nextDouble();
			canh[i]= Numberofsize;
		}
		System.out.println("Nhập đường cao: ");
		Numberofsize = in.nextDouble();
		canh[2]=Numberofsize;
	}
	
	public double P() {
		return (canh[0]+canh[1])*2;
	}
	
	public double S() {
		return canh[0]*canh[2];
	}
	
	public void inP() {
		System.out.println("Chu vi hình bình hành là: "+P());
	}
	public void inS(){
		System.out.println("Diện tích hình bình hành là: "+ S());
	}
}
