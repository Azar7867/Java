package Reflection;
import java.util.Scanner;
enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

public boolean isWeekEnd() {
	return this==SATURDAY || this==SUNDAY;
}
}
public class EnumMethod {

	public static void main(String[] args) {
		
		Day d1=Day.SATURDAY;
		System.out.println("Is today is weekend " + d1.isWeekEnd());
		Day d2=Day.FRIDAY;
		System.out.println("Is today is weekend " +d2.isWeekEnd());

	}

}
