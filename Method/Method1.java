package Method;

public class Method1 {
    static int  boxvolume(int length, int breadth, int height) {
		int vol;
		vol=length*breadth*height;
	    return vol;
	}
    static void line() {
    	System.out.println("------------------------");
    }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		line();
		System.out.println("volume is " + boxvolume(5,6,4) );
		System.out.println("------------------------");
	}

}
