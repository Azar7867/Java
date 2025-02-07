package Reflection;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3;
		float f;
		Integer i1=Integer.valueOf(i);//Boxing, Wrapping
		int j=i1.intValue();//Unboxing
		Integer i2=20;//Autoboxing
		int k=i2;//autounboxing
		
		String s="123";
		int i3 =Integer.parseInt(s);
		System.out.println(i3);

	}

}
