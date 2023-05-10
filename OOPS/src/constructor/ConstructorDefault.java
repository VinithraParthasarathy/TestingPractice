package constructor;

public class ConstructorDefault {                 //variable declaration
	String a;                 //variable declaration
	double b;
	int c;
	char r;
	public ConstructorDefault ()
	{
		a= "###";           //variable initialization
		b=2.3;
		c=3;
		r='R';
	System.out.println();
}
public void display ()
{
	System.out.println("#STRING#");
	System.out.println(a);
	System.out.println();
	System.out.println("#DOUBLE#");
	System.out.println(b);
	System.out.println();
	System.out.println("#INT#");
	System.out.println(c);
	System.out.println();
	System.out.println("#CHAR#");
	System.out.println(r);
}
public static void main(String args[])
{
	ConstructorDefault d = new ConstructorDefault();
	d.display();
}
}
