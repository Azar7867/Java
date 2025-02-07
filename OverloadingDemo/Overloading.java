package OverloadingDemo;
import java.util.*;
public class Overloading {
	static int max(int a ,int b) {
		return a>b?a:b;
	}
	static double max(double a, double b) {
		return a<b?a:b;
	}
	static char max(char a , char b) {
		return a<b?a:b;
	}

	public static void main(String[] args) {
		System.out.println("max number is :" +max( 2,4));
		System.out.println("max number is :" +max(2.3,3.5));
		System.out.println("max char is :" +max('a','b'));
		
		System.out.println("Negative to positive " + Math.abs(-4.5));
		System.out.println("negative to positive : " +Math.abs(-10.5));
	}

}
