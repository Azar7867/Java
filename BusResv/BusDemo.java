package BusResv;
import java.util.*;
public class BusDemo {

	public static void main(String[] args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
	    ArrayList<Booking> bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,3));
		buses.add(new Bus(3,true,6));
		
		int useropt=1;
		Scanner scanner=new Scanner (System.in);
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		while(useropt==1) {
			System.out.println("Enter 1 to book and 2 to exit :");
			useropt=scanner.nextInt();
			if(useropt==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("your booking is conformed ");
				}
				else
					System.out.println("Sorry bus is full . Try another bus or date.");
			}
			else {
				System.out.println("bus number no available ");
			}
			
		}
		
		
		

	}

}
