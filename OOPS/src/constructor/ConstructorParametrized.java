package constructor;

public class ConstructorParametrized{
	int a;                 //variable declaration
	
	
	public ConstructorParametrized()
	{   
		a=20;           //variable initialization
		System.out.println(a);
	}
public ConstructorParametrized (int a, int b)
{
	
	System.out.println(a+b);
}
public ConstructorParametrized (int a, double b)
{
	System.out.println(a+b);
}
public ConstructorParametrized (int a, double b, int c)
{
	System.out.println(a+b+c);
}
public ConstructorParametrized (String a, String c)
{
	System.out.println(a+c);
}
public static void main (String args[])
{
	new ConstructorParametrized();
	new ConstructorParametrized(10,20);
	new ConstructorParametrized(10,23.2);
	new ConstructorParametrized(10,3.2,3);
	new ConstructorParametrized("constructor" , " default");
	
}
}
