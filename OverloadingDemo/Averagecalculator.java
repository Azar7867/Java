package OverloadingDemo;

public class Averagecalculator {
	static double average(double num1,double num2) {
		return (num1+num2)/2;
	}
	static double average(double num1,double num2,double num3) {
		return (num1+num2+num3)/2;
	} 

		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(average(1,2));
		System.out.println(average(2,4,2));

		
		
	}

}
