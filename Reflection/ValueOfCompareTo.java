package Reflection;

enum color{
	RED,
	GREEN,BLUE;
}
public class ValueOfCompareTo {
	public static void main(String [] args) {
	color c1=color.valueOf("RED");
	System.out.println("color : " +c1);
	color c2=color.GREEN;
	System.out.println(c1.compareTo(c2));

}
}
