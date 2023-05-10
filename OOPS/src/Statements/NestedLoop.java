package Statements;

public class NestedLoop {

public void nestedLoopStatement()
{ 
	for(int row =0; row<=5; row++)     
		// row =1    1<=5
		// row =2    2<=5
		// row =3    3<=5
		// row =4    4<=5
		// row =5    5<=5
		{
			for(int col=1;col<=5;col++)   
  
			{
					if(row==0 ||col==0 ||row==1 ||col==1||row==0 ||col==2)  
						
				{
					System.out.print(" 0"); 
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
	NestedLoop l =new NestedLoop();
	l.nestedLoopStatement();
}
}





// o2o4o   
// 1o3o5
// o2o4o
// 1o3o5
// o2o4o



