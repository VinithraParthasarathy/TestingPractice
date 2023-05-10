package Statements;

public class Statements_Control {
int a=20, b=30;
int age=12;
int val= 64;
int weeknum= 2;
int months=2;
String weeksname= "tue";
String monthsname= "feb";
String checkproof = "LICENSE";
String weekname = "WEDNESDAY";
int num= 20;
public void  controlStatementsIF()
{
if(a<b&&a<b)
{
	System.out.println("if statement using AND");
	System.out.println("A is lesser than B");
}
{
if(a>b||a>b)
{
	System.out.println("if statement using OR");
	System.out.println("A is greater than B");		
}
else 
{
	System.out.println("if statement using OR");
	 System.out.println("A is lesser than B");	
}
}
}
public void ifElseStatement()
{
	if(age>=18)
	{
	System.out.println("Eligible to vote");
	}
	else
	{
		System.out.println("Not Eligible to vote");	
	}
	if(age<=18)
	{
		System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not Eligible to vote");	
		}
}
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
 public void ladderWeek()
 {
 	if(weeksname=="monday")
 	{
 		System.out.println("1");	
 }
 	else if(weeksname=="tuesday")
 {
 	System.out.println("2");
 }
 }
 public void ladderMonths()
 {
  if(monthsname=="jan")
 	{
 		System.out.println("jan");
 	}
 else if(monthsname=="feb")
 	{
 		System.out.println("2");
 	}
 }
public void controlNumber()
{
 if(num==0)
 {
	 System.out.println(num+" is even"); 
 }
 else if(num==1)
 {
	 System.out.println(num+" is even");
 }
 else
 {
	 System.out.println(num+" is odd"); 
 }
 if(num==2)
 {
	 System.out.println(num+" is even");
 }

}
public void controlSwitch() 
{
		switch(checkproof)
	{
		case "passport":
			System.out.println(checkproof+"is a valid proof");	
			break;
	case"aadhar":
	System.out.println(checkproof+"is a valid proof");
	break;
	case"LICENSE":
		System.out.println(checkproof+" is a valid proof");
		break;
	}
		switch(weekname)
		{
		case "monday":
		System.out.println("1");	
		break;
		case "tuesday":
			System.out.println("2");	
			break;
		default:
			System.out.println("3");
			break;
		}
	}
public static void main (String args[])
{
	Statements_Control d=new Statements_Control();
	d.controlStatementsIF();
	d.ifElseStatement();
	d.nestedControlStatement();
	d.nestedIf();
	d.nestedIfMonths();
	d.ladderWeek();
	d.ladderMonths();
	d.controlNumber();
	d.controlSwitch();
}

}
