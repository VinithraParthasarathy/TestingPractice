package practice;

public class Demo_Int {                     //class class name
		 int a= 55;                         //variable  //data type varname = data;
	 	  public void displayNumber()      //method    //public void methodName()       //camel notation
		{
		 System.out.println(a);            //statements   //system.out.println();
		}
	 public static void main (String args[])    //main method  //public static void main (String args[])
	 {
		Demo_Int i= new Demo_Int();           //object creation     //class name object name=new constructor();
	    i.displayNumber();                 //method call using object    //object name.methodName();
	 }

}
