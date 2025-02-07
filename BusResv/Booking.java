package BusResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking() {
		Scanner scanner =new Scanner (System.in);
		System.out.println("Enter the name of passenger: ");
		String passengerName= scanner .next();
		System.out.println("enter the bus no: ");
		int busNo=scanner.nextInt();
		System.out.println("Enter the Date dd-mm-yyyy: ");
		String dateInput=scanner.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
			int capacity=0;
			for(Bus bus:buses) {
				if(bus.getBusNo()==busNo)
					capacity=bus.getCapacity();
				
			}
			int booked =0;
			for(Booking b:bookings) {
				if(b.busNo==busNo && b.date.equals(date)) {
					booked++;
				}
			}
			return booked<capacity?true:false;
		}
	}



