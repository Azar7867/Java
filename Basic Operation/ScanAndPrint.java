package first;
import java.util.Scanner;

public class ScanAndPrint {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data types: ");
		
		if(scan.hasNextInt()) {
			System.out.println("Given value is integer");
		}
		else if(scan.hasNextFloat()) {
			System.out.println("Given value is float");
		}
		else if(scan.hasNextDouble()) {
			System.out.println("Given value is double");
			
		}
		else {
			char ch=scan.next().charAt(0);
			System.out.println("Given value is char");
		}
}
}