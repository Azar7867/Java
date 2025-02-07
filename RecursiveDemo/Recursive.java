package RecursiveDemo;
import java.util.Scanner;
public class Recursive {
	
		static int rec(int n) {
			if(n<=0)
				return 1;
			return n*(rec(n-1)); //call itself inside of method
			
			
			
		}
	
	public static void main(String [] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Factorial Number : ");
		int n=scanner.nextInt();
		System.out.println("Factorial of " + n + " is : "  + rec(n));
	}

}
