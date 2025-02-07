package OverloadingDemo;
import java.util.*;

class Students{
	String name;
	int rollno; 
	int [] marks;
	

public Students (String na,int roll,int [] mar) {
	this.name=na;
	this.rollno=roll;
	this.marks=mar;
	
	
	
}
public Students(String na, int roll) {
	this.name=na;
	this.rollno=roll;
	
}
public Students(String na) {
	this.name=na;
}
public Students() {
	
}
public int marktotal() {
	int total=0;
	for(int mark:marks) {
		total+=mark;
	}
	return total;
}
public class Student {
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores= {90,98,97};
		Students stu1=new Students("john",1,scores);
		Students stu2= new Students("alice",2);
		Students stu3=new Students("bob");
		Students stu4=new Students();
		
		stu2.marks =new int[] {78,87,86};
		stu3.marks=new int [] {79,89,97};
		stu4.marks=new int [] {98,96,95};
		
		System.out.println("student 1: " + stu1.name + "rollno :" + stu1.rollno + "total marks :" + stu1.marktotal());
		System.out.println("student 2: " + stu2.name + "rollno :" + stu2.rollno + "total marks :" + stu2.marktotal());
		System.out.println("student 3: " + stu3.name + "rollno :" + stu3.rollno + "total marks :" + stu3.marktotal());
		System.out.println("student 4: " + stu4.name + "rollno :" + stu4.rollno + "total marks :" + stu4.marktotal());
	
		
	}
}


