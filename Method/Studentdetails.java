package Method;
import java.util.*;
class students {
	String name;
	int rollno;
	int mark;
	


students(String n, int r, int m){
	this.name=n;
	this.rollno=r;
	this.mark=m;
	
}

void details(){
	System.out.println("Name : " + this.name);
	System.out.println("Rollno : " + this.rollno);
	System.out.println("Name : " + this.mark);
	
	
	
}
}
public class Studentdetails {

	public static void main(String[] args) {
		List<students>lists=new ArrayList<students>();
		String[] name= {"Arun","kumar","Rahul"};
		int[] roll= {23,43,55};
		int[] mar= {90,97,98};
		
		for(int i=0;i<3;i++) {
			students s1=new students(name[i],roll[i],mar[i]);
			lists.add(s1);
		}
		
		for(int i=0;i<3;i++) {
			lists.get(i).details();
		}
				

		}

}
