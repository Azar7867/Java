package BusReservation;
import java.util.ArrayList;
import java.util.Scanner;

 class Bus1 {
	 private int busNumber;
	 private String Destination;
	 private int totalSeats;
	 private int bookedSeats;
	 
	 Bus1(int busNumber,String Destination,int totalSeats){
		 this.busNumber=busNumber;
		 this.Destination=Destination;
		 this.totalSeats=totalSeats;
		 this.bookedSeats=0;
	 }
	 public int getBusNumber() {
		 return busNumber;
	 }
	 public String Destination() {
		 return Destination;
	 }
	 public int getAvailableSeats() {
		 return totalSeats - bookedSeats;
	 }
	 
	 public boolean bookSeats(int seats) {
		 if(seats<=getAvailableSeats()) {
			 bookedSeats += seats;
			 return true;
		 }
		 else {
			 return false;
		 }
		 
	 }
	 
	 public void displayDetails() {
		 System.out.println("bus number : " + busNumber);
		 System.out.println("Destination :" + Destination);
		 System.out.println("Available Seats : " + getAvailableSeats());
	 }
 }
 
public class Bus{

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		ArrayList<Bus1> buses=new ArrayList<Bus1>();
		
		buses.add(new Bus1(1,"melur",20));
		buses.add(new Bus1(2,"madurai",50));
		buses.add(new Bus1(3,"alanganallur",15));
		
		while(true){
			System.out.println("\n---Bus Reservation System---");
			System.out.println("1. View Available Buses ");
			System.out.println("2. Book a Seat ");
			System.out.println("3. Exit ");
			System.out.println("Enter your Choice : ");
			int Choice=scanner.nextInt();
			
			switch(Choice){
			case 1:
				System.out.println("View Available Seats :");
				for(Bus1 bus:buses) {
					bus.displayDetails();
					System.out.println();
				}
			case 2:
				System.out.println("\n Enter the bus number ");
				int busNumber=scanner.nextInt();
				boolean busFound=false;
				
				for(Bus1 bus:buses) {
					if(bus.getBusNumber()== busNumber) {
						busFound=true;
						System.out.println("enter the number of seats ");
						int seats=scanner.nextInt();
						if(bus.bookSeats(seats)) {
							System.out.println("Seat sucessfully booked :");
						}else {
							System.out.println("Seat not Available :");
						}
						break;
					}
				}
				if(!busFound) {
					System.out.println("Bus not Found");
				}
				break;
			case 3:
				System.out.println("Exiting...... Thank you!");
				scanner.close();
				return;
				
			default:
				System.out.println("Invalid Choice Please try again .");
			}
			
		}

	}

}
 
 
