package practice;

public class Demo_Double {                                        //class class name
	 double d = 78.5;	                                      //variable  //data type varname = data;
	 public void displayNumber()	                  //method    //public void methodName()       //camel notation
		{
		 System.out.println(d);                     //statements   //system.out.println();
		}
	 public static void main (String args[])      //main method  //public static void main (String args[])
	 {
		 Demo_Double d= new Demo_Double();                   //object creation     //class name object name=new constructor();
	     d.displayNumber();                                     	//method call using object    //object name.methodName();
	 }
}
