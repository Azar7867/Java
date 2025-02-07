package AtmMachineDemo;
import java.util.ArrayList;
import java .util.Scanner;
class Cookie{
	 String cookieName;
	private double Price;
	private int Stock;
	Cookie(String cookieName,double Price,int Stock){
		this.cookieName=cookieName;
		this.Price=Price;
		this.Stock=Stock;
	}
	public  String getcookieName() {
		return cookieName;
	}
	public double getPrice() {
		return  Price;
	}
	public void setcookieName(String CN){
		cookieName=CN;
	}
	public void setPrice(double p) {
		Price=p;
	}
	public void stock(int q1) {
		if(q1<=Stock) {
			Stock-=q1;
			System.out.println("available stock :" + Stock);
		}
	}
	public  void displayMenu() {
		
		System.out.println("Cookie Name  : " + cookieName);
		System.out.println("Cookie Price  : " + Price);
		System.out.println("Available Stock : " + Stock);
		System.out.println("");
	}
}
public class BuscuitDemo {
	static Scanner scanner=new Scanner(System.in);
	static ArrayList<Cookie> cookies=new ArrayList<Cookie>();
	public static void main(String [] args) {
		
		cookies.add(new Cookie("Marie",10,5));
		cookies.add(new Cookie("Good day",15,10));
		cookies.add(new Cookie("Britania",20,10));
		  while(true) {
			  System.out.println("Display Menu :");
			  System.out.println("booked cookie");
			  System.out.println("exit");
			  System.out.println("Enter your choice");
			  int choice=scanner.nextInt();
			  switch(choice) {
			  case 1:
				  for(Cookie Cookies:cookies) {
				   Cookies.displayMenu();
				   }
				  
			  case 2:
				  stockava();
			
				  }
		  }
		
	}
	
	public static void stockava() {
		
		  System.out.println("enter the cookie name :");
			String co1=scanner.next();
			System.out.println("enter the quantity ");
			int q1=scanner.nextInt();
			for(Cookie Cookies:cookies) {
				if(Cookies.cookieName==co1) {
					System.out.println("cookie booked");
					Cookies.stock(q1);
					return;
				}
			}
		
		}
	

}


