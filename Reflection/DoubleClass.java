package Reflection;

class outer{
	void met1() {
		System.out.println("outer class");
	}
	class inner{
		void met() {
			System.out.println("inner class ");
		}
	}
}
public class DoubleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer c=new outer();
		c.met1();
		 outer.inner c1=c.new inner();
		 c1.met();
		

	}

}
