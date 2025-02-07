package AtmMachineDemo;

import java.lang.reflect.*;

public class Reflection {
	public static void main (String [] args) {
		Account a1=new Account(2, "azar", 1);
		Class c1=a1.getClass();
		System.out.println("class name is :" + c1);
		Method [] method=c1.getMethods();
		for(Method m:method) {
			System.out.println("method name is " + m.getName());
		}
		System.out.println(method[0].invoke());
	}

}
