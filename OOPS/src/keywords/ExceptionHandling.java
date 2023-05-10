package keywords;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String args[])
	{
		System.out.println("Enter the numbers given"+  " ");
	 try(Scanner i = new Scanner(System.in)) {
		int a =	i.nextInt();
		int a1=	i.nextInt();
		
		System.out.println("## division ##");
			System.out.println(a/a1);
	 }
	 catch (Exception i)
		{
			System.err.println("## EXCEPTION HANDLED ##");
			System.err.println(i.getMessage());
		}
		
		 finally
		 {
			 System.out.println("executed");
		 }
		System.out.println("## DONE ##");
	}
	}

