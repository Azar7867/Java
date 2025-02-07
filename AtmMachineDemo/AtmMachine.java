package AtmMachineDemo;
import java .util.ArrayList;
import java.util.Scanner;
class Account{
	int accountNumber;
	String accountHolder;
	double balance;
	
	Account(int accountNumber,String accountHolder,double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposit Sucessful .New Balance : " + balance);
	}
	void withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("withdraw is sucessfull : " +balance);
		}
		else {
			System.out.println("Insufficient balance " );
		}
	}
	void checkBalance() {
		System.out.println("current Balance : " + balance);
	}
}
public class AtmMachine {
	static ArrayList<Account> accounts=new ArrayList<Account>();
	static Scanner scanner =new Scanner (System.in);

	public static void main(String[] args) {
		accounts.add(new Account(1,"john",1500));
		accounts.add(new Account(1,"azar",150000));
		accounts.add(new Account(3,"jai",3000));
		
		while(true) {
			System.out.println("1. Login ");
			System.out.println("2. Create Account ");
			System.out.println("3. Exit ");
			System.out.println("Enter your choice ");
			int choice =scanner.nextInt();
			switch(choice) {
			case 1:
				login();
				break;
			case 2:
				createAccount();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice ");
			}
		}

	}
	public static void login() {
		System.out.println("enter the account number :");
		int accountNumber=scanner.nextInt();
		System.out.println("enter the account holder name ");
		String accountHolder=scanner.next();
		for(Account account:accounts) {
			if(account.accountNumber==accountNumber && account.accountHolder.equals(accountHolder)) {
				System.out.println("login sucessfull ");
				accountMenu(account);
				return;
				
			}
			
			}
		System.out.println("invalid account number ");
		
		}
	
	public static void createAccount() {
		System.out.println("enter the account holder name ");
		String accountHolder=scanner.next();
		System.out.println("enter the initial deposit ");
		double balance=scanner.nextDouble();
		Account newAccount=new Account(accounts.size()+1,accountHolder,balance);
		accounts.add(newAccount);
		System.out.println("account created sucessfull account number " + newAccount.accountNumber);
	}
	public static void accountMenu(Account Account) {
		while(true) {
			System.out.println("1. Deposit");
			System.out.println("2.Withdraw ");
			System.out.println("3.balance");
			System.out.println("4.Logout");
			System.out.println("enter your choice ");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the deposite amount");
				double depositAmount=scanner.nextDouble();
				Account.deposit(depositAmount);
				break;
			case 2:
				System.out.println("Enter withdraw amount ");
				double withdrawlAmount=scanner.nextDouble();
				Account.withdraw(withdrawlAmount);
				break;
			case 3:
				Account.checkBalance();
				break;
			case 4:
				System.out.println("log out sucessfull");
				return;
			default:
				System.out.println("default choice");
			}
		}
	}

}
