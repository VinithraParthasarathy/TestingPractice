package keywords;

public class Son  extends Parent{
public void bike()
{ 
 System.out.println("ktm bike");
 super.watch();
 System.out.println();

}
public static void main(String args[])
{
	Son s = new Son();
	s.bike();
	
}
}
