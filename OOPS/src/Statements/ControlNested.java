package Statements;

public class ControlNested {
int val= 64;
int weeknum= 2;
int months=2;
public void nestedControlStatement()
{
	if(val%2==0)
	{
	System.out.println(val+" is completely divisible by 2");
	}
	if(val%4==0) 
	{
		System.out.println(val+" is completely divisible by 4");
	}
	if(val%6==0)
	{
		System.out.println(val+" is completely divisible by 6");
	}
	else
	{
		System.out.println(val+" is not completely divisible by 6");
	}
	if(val%8==0)
	{
		System.out.println(val+" is completely divisible by 8");
	}
	if(val%9==0)
	{
		System.out.println(val+" is completely divisible by 9");
	}
	else
	{
		System.out.println(val+" is not completely divisible by 9");
	}
}
public void nestedIf()
{
	if(weeknum==1)
	{
		System.out.println("SUNDAY");	
}
	else if(weeknum==2)
{
	System.out.println("MONDAY");
}
}
public void nestedIfMonths()
{
 if(months==1)
	{
		System.out.println("jan");
	}
else if(months==3)
	{
		System.out.println("feb");
	}
else 
{
	System.out.println("Give Valid Month Number");
}

}
public static void main(String args[])
{
	ControlNested d = new ControlNested();
	d.nestedControlStatement();
	d.nestedIf();
	d.nestedIfMonths();
}
}
