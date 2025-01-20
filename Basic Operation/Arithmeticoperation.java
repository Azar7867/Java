package first;

import java.util.Scanner;

public class Arithmeticoperation {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number");
		Double num1=scanner.nextDouble();
		System.out.println("Enter the second number");
		Double num2=scanner.nextDouble();
		
		Double sum=num1+num2;
		Double sub=num1-num2;
		Double mul=num1*num2;
		Double div=num1/num2;
		Double mod=num1%num2;
		
		System.out.println("Arithmetic operation :");
		System.out.println("Sum: " + sum);
		System.out.println("sub: " + sub);
		System.out.println("mul: " + mul);
		if(num2!=0) {
			System.out.println("div: " + div);
			System.out.println("mod: " + mod);
		}
		else {
			System.out.println("Does not perform div and mod: ");
		}
		scanner.close();
		
	}

}
