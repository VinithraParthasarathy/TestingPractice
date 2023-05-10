package abstraction;

public class Child extends Parent{
public void icecream()

{
System.out.println("#Abstraction Class#"); //partially fully abstracted
System.out.println("ICECREAM");
}
@Override
public void dosa() 
{
	
	System.out.println("DOSA");	
}
	public static void main (String args[])
	{
       Child c = new Child();
       c.icecream();
       c.idly();
       c.dosa ();
	}

	

}
