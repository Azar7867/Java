package inheritance;
import java.util.*;
class Employee{
	 private String Name;
	 public double Salary;
	Employee(String N,double S){
		this.Name=N;
		this.Salary=S;
	}
//	Employee(){
//		Name="";
//		Salary=0.0;
//	}
	double getSalary() {
		return Salary;
	}
	String getName() {
		return Name;
	}
	void setSalary(double S) {
		Salary=S;
	}
	void setName(String N) {
		Name=N;
	}
  void  bonus(double percent) {
		Salary+=Salary*percent/100;
		
	}
	double getSalarybonus() {
		return Salary;
	}
}
class Manager extends Employee{
	double Bonus;
	Manager(String N,double S, double b){
		super(N,S);
		Bonus=b;
		}
	void setbonus(double b) {
		Bonus=b;
	}
	public double getSalary() {
		return super.getSalary()+Bonus;
	}
}


		
	

public class Inheritance {
	public static void main(String [] args) {
	Employee e1=new Employee("azar",20000);
	e1.bonus(20);
	System.out.println("base class " + e1.getSalarybonus());
	Manager m1=new Manager("az",23000,300);
	m1.bonus(10);
	System.out.println("child class " + m1.getSalary());
	

}


}
