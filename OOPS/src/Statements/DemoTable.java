package Statements;

public class DemoTable {

public void controlTable()
{ int val=5;
	for(int num=1; num<=10; num++)	
	{
		System.out.println(val+"*"+num + "="+val*num);
	}
}
	public static void main(String args[])
	{
		DemoTable demoTable = new DemoTable();
		demoTable.controlTable();
	}
}
