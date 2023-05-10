package practice;

public class ReturnArrayDemo {
public void arrayReturn()
{
	int arr[]= {10,20,30,40,50};
	System.out.println(arr[3]);
	System.out.println(arr.length);
	System.out.println();
		for (int i=0; i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
		System.out.println();
}
public void arrayReturn(int j[])
	{
	for (int i=j.length-1; i>=0 ;i-- )
	{
		System.out.println(j[i]);
	}
	System.out.println();
}
public int[] returnArr(int rarr[])
{
	
	return rarr;
}
	public static void main(String args[])
	{
	ReturnArrayDemo r = new ReturnArrayDemo();
	r.arrayReturn();
	int j[]= {22,33,44,55};
    r.arrayReturn(j);
    
    int rarr[]= {1,2,3};
    {
    for(int i=0; i<rarr.length ;i++ )
    {
    	System.out.println(rarr[i]);
    }
    }
	}
}

