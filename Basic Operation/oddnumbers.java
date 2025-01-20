package first;
import java.util.Scanner;
public class oddnumbers {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of odd numbers");
		int n= scanner.nextInt();
		int i;
		for(i=1;i<n*2;i +=2) {
			System.out.print(i + " ");
		}
	}

}
