package constructor;

public class ConstructorPractice {
int a;
public ConstructorPractice ()
{
	this(10,12);                     //2
	a= 10;                           //3
	System.out.println(a);
}
public ConstructorPractice (int a, int b)
{
	this(2,2.0);                     //1
	System.out.println(a+b);
}
public ConstructorPractice(int a, double b)
{
	System.out.println(a+b);
}

public static void main (String args[])
{
	new ConstructorPractice();
	
	
}
}
