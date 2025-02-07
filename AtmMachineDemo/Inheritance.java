package AtmMachineDemo;



abstract class Manager1{ //abstract class have do not create objects
	private String name;
	abstract void welcomeMessage();
	public String getName() {  //concreate to create get method in inside of abstract class
		return name;
	}
	
}
class students extends Manager1{
	void welcomeMessage() {
		System.out.println("hello students");
	}
}
class teacher extends Manager1{
	void welcomeMessage() {
		System.out.println("hello teacher");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students s1=new students();
		teacher t1=new teacher();
//		Manager m1=new students();
		Manager1 [] m=new Manager1[4];
		m[0]=new students();
		m[1]=new students();
		m[2]=new teacher();
		m[3]=new teacher();
		for(Manager1 m1:m) {
			m1.welcomeMessage();
		}

	}

}
