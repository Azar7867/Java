package Array;

public class Arraynum {

	public static void main(String[] args) {
		int[] n= {1,2,4,5};
		int sum=0;
		for(int i=0;i<n.length;i++) {
			sum+=n[i];
		}
		System.out.println(sum);
	    int val= 5*(5+1)/2 - sum;
		System.out.println(val);
	}

}
