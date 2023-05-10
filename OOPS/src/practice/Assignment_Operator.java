package practice;

public class Assignment_Operator {
int a=10;
int b=20;
public void assignmentOps()
{
System.out.println("b using +=:"+b);
b+=a;
System.out.println("b using +=:"+b);
b-=a;
System.out.println("b using +=:"+b);
b*=a;

}
public static void main(String args[])
{
	Assignment_Operator d=new Assignment_Operator();
	d.assignmentOps();
}
}


