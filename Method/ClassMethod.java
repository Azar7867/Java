package Method;

class box{
	int length;  //instance variable
	int breadth;
	int height;
	
	box(int l, int b, int h){  //constructor
		length=l;
		breadth=b;
		height=h;
		System.out.println("sum of constructor box value :" + l + b + h);
		System.out.println(" ");
		
	}
	
	void setdim(int l, int b, int h) {
		length=l;
		breadth=b;
		height=h;
		System.out.println("sum of setdim value :" + l + b + h);
		System.out.println(" ");
	}
	
	
	int volume() {
		return length*breadth*height;
	}
}
public class ClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------- ");
		
		box blackbox;
		blackbox=new box(5,4,3);
		
		blackbox.setdim(7, 6, 5);
		
		
		System.out.println("volume of blackbox is " + blackbox.volume());  //invoke-using object to call method-- volume
		
		System.out.println("-------------------------- ");
		
		box woodbox=new box(3,2,4);
		woodbox.height=5;
		woodbox.length=6;
		woodbox.breadth=10;
		
		System.out.println("volume of woodbox is " + woodbox.volume());
		System.out.println("-------------------------- ");
        

	}

}
