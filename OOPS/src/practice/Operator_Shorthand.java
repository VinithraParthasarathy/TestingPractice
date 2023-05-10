package practice;

public class Operator_Shorthand {
int a=10, b=20;
public void shorthandOperator()
{
	System.out.println("#Add a+b for a#");
	a+=b;
	System.out.println(a);
	System.out.println("#Add a+b for b#");
	b+=a;
	System.out.println(b);
	System.out.println("#Add a-b for a#");
	a-=b;
	System.out.println(a);
	System.out.println("#Add a-b for b#");
	b-=a;
	System.out.println(b);
	System.out.println("#Add a*b for a#");
	a*=b;
	System.out.println(a);
	System.out.println("#Add a*b for b#");
	b*=a;
	System.out.println(b);
	System.out.println("#Add a/b for a#");
	a/=b;
	System.out.println(a);
	System.out.println("#Add a/b for b#");
	b/=a;
	System.out.println(b);
}
public static void main(String args[])
{
	Operator_Shorthand d = new Operator_Shorthand();
	d.shorthandOperator();
}
}
