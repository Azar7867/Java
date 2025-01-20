package Pattern;

public class Pattern {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			
			for(int s=1; s<=5-i; s++) {
				System.out.println(" ");
			
			for(int j=i; j<=i*2-1; j++) {
				System.out.println("*");
			}
			System.out.println();
			}
		}
	}

}



