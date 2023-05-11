package practice;

public class Script_Int_Practice {         // class class Name
	int a = 10;
	int b = 20;
	int c = 30;
	double d = 34.567;
	char r = '%';
	boolean n = true;
	String s = "&dj";                     // variable //data type varname = data;

	public void datatypes()                 // method //public void method Name()
	{ 
		System.out.println(a + b);             // statements //System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(r);
		System.out.println(n);
		
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(a < b);
		System.out.println(a > b);
	}
	
	

	public static void main(String args[])                       // main method //public static void main (String args[])
	{
		Script_Int_Practice k = new Script_Int_Practice();       // instance or object creation //class name object name= new constructor ();													
		k.datatypes();                                           // method call using object // object name.method Name();
	}
}
