package practice;

public class Demo_String {                              //class ClassName
	String s =  "3456789";                        //variable  //data type varname = "data";
	  public void displayNumber()                       //method  //public void methodName()
	{
	   System.out.println(s);                       //statements //System.out.println();
	}
	  public static void main (String args[])       //main method  //public static void main (String args[])
	{
	 Demo_String d = new Demo_String();                          //object  //class name object name = new constructor();
	  d.displayNumber();                         //method call using object  //object name.method name();
	}
}
