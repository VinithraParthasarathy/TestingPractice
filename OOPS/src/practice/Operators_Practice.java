package practice;

public class Operators_Practice {
int a=10, b=20;
public void operatorArithmetic()
{System.out.println("####operatorArithmetic####");
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
}
public void operatorRelational()
{System.out.println("####operatorRelational####");
	System.out.println(a<b);
	System.out.println(a>b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a==b);
}
public void operatorLogical()
{
	System.out.println("###Logical Operators for AND###");	//statements //System.out.println();
	System.out.println(a>b&&a<b);
	System.out.println("###Logical Operators for OR###");
	System.out.println(a>b||a<b);
	System.out.println("###Logical Operators for NOT###");
	System.out.println(!(a<b));	
}
public void operatorConditional()
{System.out.println("####operatorConditional####");
	System.out.println(a<b?"A is less than B" : "A is greater than B");
}
public void shorthandOperator()
{System.out.println("####shorthandOperator####");
	a+=b;
	System.out.println(a);
	b+=a;
	System.out.println(b);
	a-=b;
	System.out.println(a);
	a*=b;
	System.out.println(b);
	a/=b;
	System.out.println(a);
	a%=b;
}
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
public void assignmentOps()
{
	System.out.println("####assignmentOps####");
System.out.println(b+=a);
System.out.println(b-=a);
System.out.println(b*=a);
System.out.println(b/=a);
}
public void concatenationOps()
{
	System.out.println("####concatenationOps####");
	System.out.println("Practice "+"of"+" Operators");
	System.out.println("types "+"of"+" Operators");
}
public static void main(String args[])
{
	Operators_Practice d=new Operators_Practice();
	d.operatorArithmetic();
	d.operatorRelational();
	d.operatorLogical();
	d.operatorConditional();
	d.shorthandOperator();
	d.incDecOps();
	d.assignmentOps();
	d.concatenationOps();
}
}
