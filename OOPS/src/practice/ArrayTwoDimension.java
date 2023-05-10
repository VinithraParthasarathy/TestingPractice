package practice;
public class ArrayTwoDimension {
int twoarr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16,1},{17,18,19,20,1,2}};
char tarr[][]={{'A','B','C'},
		{'D','E','F','G','H'},
		{'I','J','K','L','M','N','O'},
		{'N','P','Q','R','S','T','U','V','W'}};
public void twoDimensionArray()
{
	System.out.println(twoarr.length);  //row
	System.out.println(twoarr[4].length);  //column
	System.out.println(twoarr[1][2]);   
	System.out.println("#LOOP#");
for(int row=0; row<twoarr.length; row++)  
{ 
	for(int col=0; col<twoarr[row].length; col++)
	{
		System.out.print(twoarr[row][col]+ " ");
	}
	System.out.println();
}
System.out.println("##ENHANCED LOOP##");
	for(int[]k:twoarr)
	{
		for(int j:k)
		{
			System.out.print(j+" ");
		}
		
		System.out.println();
	}
}
public void twoDimensionTask()
{
	System.out.println(tarr.length);
	System.out.println(tarr[1].length);
	System.out.println(tarr[1][2]); 
	System.out.println("#LOOP#");
	for(int row=0; row<tarr.length; row++)
	{
		for(int col=0; col<tarr[row].length; col++)
		{
			System.out.print(tarr[row][col]+ " ");
		}
		System.out.println();
	}
	System.out.println("##ENHANCED LOOP##");
	for (char[] k:tarr)
	{
		for(char j:k)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}	
}
public static void main(String args[])
{
	ArrayTwoDimension l =new ArrayTwoDimension();
	l.twoDimensionArray();
	l.twoDimensionTask();
}
}
