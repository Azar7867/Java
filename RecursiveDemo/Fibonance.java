package RecursiveDemo;

public class Fibonance {
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		for (int i=0;i<=num;i++) {
			System.out.println(fib(i));
		}
		

	}

}
