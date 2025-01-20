package Loop;
import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of stars : ");
		int n=scanner.nextInt();
		outerloop:
		for(int i=1;i<=n;i++) {
			innerloop:
			for(int j=1;j<=n;j++) {
				if(i==3 && j==3)
					break outerloop;
				System.out.print("*");
			}
		    System.out.print("\n");
		}

	}

}
