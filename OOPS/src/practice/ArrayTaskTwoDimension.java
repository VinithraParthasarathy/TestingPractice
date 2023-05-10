package practice;
public class ArrayTaskTwoDimension {
	char tarr[][]={{'A','B','C'},{'D','E','F','G','H'},{'I','J','K','L','M','N','O'},{'N','P','Q','R','S','T','U','V','W'}};
	public void twoDimensionTask()
	{
		System.out.println(tarr.length);
		System.out.println(tarr[1].length);
		System.out.println(tarr[1][2]);  
		System.out.println("#LOOPING#");
		for(int row=0; row<tarr.length; row++)
		{
			for(int col=0; col<tarr[row].length; col++)

			{
				System.out.print(tarr[row][col]+ " ");
			}
			System.out.println();
			
		}
		
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
		ArrayTaskTwoDimension d = new ArrayTaskTwoDimension();
		d.twoDimensionTask();
	}
}