package first;
import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
		System.out.println("enter the number of pyramid:");
		int rows=scanner.nextInt();
		for(int i=1; i<=rows; i++) {
			
			
			for(int s=1; s<=5-i; s++) {
				System.out.println(" ");
			
			for(int j=i; j<=(i*2)-1; j++) {
				System.out.println("*");
			}
			
			}
		scanner.close();	
		}
	}
		
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number:");
		int scan= scanner.nextInt();
		int num=scan ;
		num += 100;
		System.out.println("add number using compound assingnment: " +num);
		*/
		
	}


