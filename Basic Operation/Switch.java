package first;
import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the number1 : ");
		int num1=scanner.nextInt();
		System.out.println("enter the number2 : ");
		int num2=scanner.nextInt();
		System.out.println("enter the operator + ,- ,* ,/ : ");
		char operator=scanner.next().charAt(0);
		switch(operator) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case '/':
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			break;
		default:
			System.out.println("operator dose not valid");
		}
		
	}

}
