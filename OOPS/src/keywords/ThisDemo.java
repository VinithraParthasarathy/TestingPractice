package keywords;

public class ThisDemo {
int a;                 //variable declaration
	
	public ThisDemo()
	{
		this(10,20);
		a=20;           //variable initialization
		System.out.println(a);
	}
public ThisDemo (int a, int b)
{
	this("hello","everyone");
	System.out.println(a+b);
}

public ThisDemo (String a, String b)
{
	
	System.out.println(a+b);
}

public static void main (String args[])
{
	
	new ThisDemo();
	
	
	
}
}
