package ArgumentsDemo;
public class Arguments {
	/*static int max(int... vals) {
		int max=Integer.MAX_VALUE;
		for(int k:vals) {
			if(k<max)
				max=k;
		}
		return max;
	} */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Min value is : " +max(43,76,21,12,3,45));
		System.out.println("Min value is : " +max(-1,4,3,6,-2));
			*/
		for (int i=0;i<args.length;i++) {
			System.out.println("arguments of passing run configure : " +args[i]);
		}
		}
	

}

