package practice;

public class Demo_Character {                                  //class class name
	   char c = '*';                                   //variable  //data type varname = 'data';
	 	public void displayNumber()                  //method    //public void methodName()       //camel notation
		{
		 System.out.println(c);                  //statements   //system.out.println();
		}
	 public static void main (String args[])      //main method  //public static void main (String args[])
	 {
		 Demo_Character d = new Demo_Character();          //object creation     //class name object name=new constructor();
	     d.displayNumber();                              	//method call using object    //object name.methodName();
	 }
}
