package practice;

public class Increment_Decrement_Operator {
int a=20;
public void incDecOps()
{
	System.out.println(a++);
	System.out.println("#post increment#");
	System.out.println(++a);
	System.out.println("#pre increment#");
	System.out.println(--a);
	System.out.println("#pre deccrement#");
	System.out.println(a--);
	System.out.println("#post deccrement#");
}
public static void main(String args[])
{
	Increment_Decrement_Operator d = new Increment_Decrement_Operator();
	d.incDecOps();
}
}
