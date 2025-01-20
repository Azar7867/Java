package Loop;
import java.util.Scanner;
public class Prime {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number :");
		Double n=scanner.nextDouble();
		if(n<0) {
			System.out.println("Given number is negative");
			}
		else {
			if(n%2==0) {
				System.out.println("It is not prime number ");
				
			}
				
		}
	}

}
