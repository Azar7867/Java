package Reflection;

interface Vechicle{//abstract means do not create object
	int MAX_SPEED=50; //FINAL,STATIC
	void ride();
	 default void display() {
		 System.out.println("interface method");
	 }
}

class Car implements Vechicle{
	public void ride() {
		System.out.println("You are riding a car");
	}
}
class bike implements Vechicle{
	public void ride() {
		System.out.println("You are riding a bike");
	}
}
class Mechanic{
	void check(Vechicle v) {
		System.out.println("Checking...");
		v.ride();
	}
}
public class Rideable {

	public static void main(String[] args) {
		Vechicle v1=new Car();
		Mechanic m1=new Mechanic();
		Car c1=new Car();
		bike b1=new bike();
		m1.check(c1);
		m1.check(b1);
		v1.display();

	}

}
