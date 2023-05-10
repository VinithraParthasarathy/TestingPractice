package practice;

public class ArrayDemo {
int arr [] = {11,22,33,44,55,66,77,88,99};  
public void checkArray()
{
	System.out.println(arr[2]);
	System.out.println(arr[5]);
	System.out.println(arr.length); 
	System.out.println("#LOOP#");
	for (int i =0; i<arr.length; i++ )
	{
		System.out.println(arr[i]);
	}
	System.out.println("#REVERSAL LOOP#");
	for (int i =arr.length-1; i>0; i-- )
	{
		System.out.println(arr[i]);
	}
	System.out.println("#5th ARRAY#");
	{
		System.out.println(arr[5]);
	}
	System.out.println("#ENHANCED LOOP#");   
	for (int k : arr) 
	{
	System.out.println(k);
	}
}
public static void main(String[] args)
{
	ArrayDemo d = new ArrayDemo();
	d.checkArray();
}
}
