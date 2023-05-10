package polymorphism;

public class Son extends MethodOveride_Parent{
public void appleIphone()
{
	System.out.println("Son -Phone");
}
public void pC()
{
	System.out.println("Son -computer");
}
public static void main(String args[])
{
	Son s = new Son();
    s.appleIphone();
    s.sonyPhone();
    s.pC();
    System.out.println();
    MethodOveride_Parent p=new MethodOveride_Parent();
    p.sonyPhone();
    p.pC();
    System.out.println();
    MethodOveride_Parent o =new Son();   //up casting
    o.sonyPhone();
    o.pC();                              //overridden
   // o.appleIphone();//invalid
	
}
}
