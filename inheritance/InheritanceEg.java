package inheritance;
import java.util.*;
class Animal{
	String Name;
	int Age;
	Animal(String Name,int Age) {
		this.Name=Name;
		this.Age=Age;
	}
	void eat() {
		System.out.println(Name + " is eating");
	}
	void sleep() {
		System.out.println(Name + " is sleeping ");
	}
	
}
class Cat extends Animal{

	String color;
	Cat(String Name, int Age,String color){
		super(Name,Age);
		this.Name=Name;
		this.Age=Age;
		this.color=color;
	}
	void meow() {
		System.out.println(Name + " is meowing");
	}
}
class dog extends Animal{
	String type;
	dog(String Name,int Age,String type){
		super(Name,Age);
		this.Name=Name;
		this.Age=Age;
		this.type=type;
	}
	void bark() {
		System.out.println(Name + " is barking ");
	}
}
public class InheritanceEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Cat c1=new Cat("joe",3,"white");
		dog d1=new dog("ram",2,"original");
		c1.eat();
		c1.meow();
		c1.sleep();
		d1.bark();
		d1.eat();
		d1.eat();

	}

}
