package first;

import java.io.*;																	 
import java.util.Scanner;

public class first {
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
		System.out.println("what is your name");
		String name =scanner.nextLine();
		
		
		System.out.println("rating from 1 to 5 ");
		Short rating=scanner.nextShort();
		scanner.nextLine();
		System.out.println("enter your email");
		String email=scanner.nextLine();
		System.out.println("hello "+ name);
		System.out.println("your rating " + rating);
		System.out.println("your Email is " + email);

}
	}
	
