package Statements;

public class ControlConditionalStatement {

public void conditionalControl()

		{ int Mind=1;
		
	for(int num= 1; num<=5; num++ )
		//1 //1<=5 //mind= 1
		//2 //2<=5 //mind= 2
		//3 //3<=5 //mind= 2*3=6
		//4 //4<=5 //mind= 4*6=24
		//5 //5<=5 //mind= 5*24=120
	{
		Mind = Mind * num; 
		
	}	
	System.out.println("####TOTAL VALUE####");
	System.out.println(Mind);
		
	}
public void jumpingContinue()
{
	System.out.println("####ALL VALUES####");
	for(int num=1; num<=10; num++)
{
	if (num==4)
{
	continue;
	}

{
	if (num==10)
	{
		break;
	}
	{ 
		System.out.println(num);
	}
}
}
}
public void controlTable()
{ 
	System.out.println("####TABLE OF 12####");
	int table=12;
	for(int num=1; num<=10; num++)	
	
	{ 
		System.out.println(table+"*"+num + "="+table*num);
	}

}
public void nestedLoop()
{ 
	System.out.println("####NESTED LOOP1####");
	for(int row =1; row<=5; row++) 
	{
		for(int col= 1; col<=5; col++) 
		{
			System.out.print(" 0");	
		} 

		{
			System.out.println();
		}
	}
	
}
public void nestedLoopStatement()
{ System.out.println("####NESTED LOOP2####");
	for(int row =1; row<=6; row++)     // row =1    1<=5
		{
			for(int col=1;col<=6;col++)   //col=3  2<=5
			{
				if(row==1 ||row==6 ||col==1  ||col==6)   
				{
					System.out.print(" o"); 
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	
}
public void nestedLoopTaskStatement()
{ System.out.println("####NESTED LOOP3####");
	for(int row =1; row<=5; row++)    
		{
			for(int col=1; col<=5; col++)   
			{
				if(row%2==1&&col%2==1||row%2==0&&col%2==0)   
				{
					System.out.print(" *"); 
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
}
	public void nestedTaskStatement()
	{ System.out.println("####NESTED LOOP4####");
		for(int row =1; row<=5; row++)    
			{
				for(int col=1; col<=5; col++)   
				{
					if(row%2==0&&col%2==1||row%2==1&&col%2==0)   
					{
						System.out.print(" *"); 
					}
					else
					{
						System.out.print("  ");
					}
					
				}
				System.out.println();
			}
}

public static void main(String args[])
{
	ControlConditionalStatement l=new ControlConditionalStatement();
	l.conditionalControl();
	l.jumpingContinue();
	l.controlTable();
	l.nestedLoop();
	l.nestedLoopStatement();
	l.nestedLoopTaskStatement();
	l.nestedTaskStatement();
	
}
}
