
public class ReturningArray {
 int arr []= {1,2,3,4,5,6,7,8,9,10};

public void arrReturn()
{
	System.out.println(arr);
    System.out.println(arr.length);
}
 {
 for(int s=arr.length-1; s>=0 ;s-- ) 
 {
 System.out.println();
 
 }
 }
public static void main(String args[])
{
	ReturningArray a = new ReturningArray();
	a.arrReturn();
}
}
