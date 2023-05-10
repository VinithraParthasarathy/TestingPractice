package practice;

public class TwoDArray {
	int twoarr[][]= {{1,2,3},{4,5,6,2},{7,8,9,3,4},{10,11,12,5,6,7}};
	public void TwoD()
	{
		System.out.println("#3rd ROW#");
	for(int row=3; row<twoarr.length; row++)  
	{ 
		for(int col=0; col<twoarr[row].length; col++)
		{
			System.out.print(twoarr[row][col]+ " ");
		}
		System.out.println();
		System.out.println();
	}
	System.out.println("#LOOP#");
	for(int row=0; row<twoarr.length; row++)  
	{ 
		for(int col=0; col<twoarr[row].length; col++)
		{
			System.out.print(twoarr[row][col]+ " ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("#REVERSAL LOOP#");
	for (int i =twoarr.length-1; i>=0; i-- )
	{
		for(int j=twoarr.length-1; j>=0; j--)
		{
			System.out.print(twoarr[i][j]+ " ");
		}
		System.out.println();
	}
	}
	public static void main(String args[])
	{
	TwoDArray d = new TwoDArray();
	d.TwoD();
	}
}