package practice;

public class Operators_Logical {                       //class class Name
	int a=23, b=34;                            //variable //data type varname = data;
	public void logicalOperators()                              //method //public void method Name()
	{
		System.out.println("###Logical Operators for AND###");	//statements //System.out.println();
		System.out.println(a<b&&a>b);
		System.out.println("###Logical Operators for OR###");
		System.out.println(a<b||a<b);
		System.out.println("###Logical Operators for NOT###");
		System.out.println(!(a<b));	
	}
	
	public static void main(String args[])                   //main method //public static void main(String args[])
	{
		Operators_Logical d = new Operators_Logical();	//object //class name object name = new constructor();
		d.logicalOperators();                           //method call using object //object name.method Name();
	}
   
}
