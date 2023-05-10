package practice;

public class ArrayTask {
String arr[] = {"apple","mango","orange","melon","banana","kiwi"};
public void taskArray()
{
	System.out.println("#ARRAY SIZE#");
	System.out.println(arr.length);
	System.out.println("#LOOPING#");
	for (int a=0; a<arr.length; a++ )
	{
		System.out.println(arr[a]);
	}
	System.out.println("#REVERSAL LOOP#");
	for (int a =arr.length-1; a>0; a-- )
	{
		System.out.println(arr[a]);
	}
	System.out.println("#ARRAY#");
	{
		System.out.println(arr[5]);
	}
	System.out.println("#ENHANCED LOOP#");   
	for (String k : arr) 
	{
		System.out.println(k);
	}
}
public static void main(String args[])
	{
		ArrayTask f =new ArrayTask();
		f.taskArray();
	}
}



	