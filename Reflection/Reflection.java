package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) {
		Demo d1=new Demo();
		Class c1=d1.getClass();
		System.out.println(c1);
		Method[] method=c1.getMethods();
		for(Method m1:method) {
			System.out.println(m1.getName());
		}
		d1.Demo1(3);
		try {
			System.out.println(method[1].invoke(8));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
