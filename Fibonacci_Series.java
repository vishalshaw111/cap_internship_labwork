package lab1;
import java.util.*;
public class Fibonacci_Series {
	 public void printFibonacci(int n,int n1,int n2)  
	 {
		 int n3=0;
		 for(int i=2;i<n;++i)    
		 {    
			 n3=n1+n2;    
			 System.out.print(" "+n3);    
			 n1=n2;    
			 n2=n3;    
		 } 
	 }
	 public void printFibonacciRecursion(int n,int n1,int n2)
	 {      int n3=0;
		    if(n>0)
		    {
		         n3 = n1 + n2;    
		         n1 = n2;    
		         n2 = n3;    
		         System.out.print(" "+n3);   
		         printFibonacci(n-1,n1,n2);    
		     }
	 }
     public static void main(String args[])  
	{    
		Scanner sc = new Scanner(System.in);
		Fibonacci_Series ob = new Fibonacci_Series();
		System.out.println("Enter no. of terms:");
		int n=sc.nextInt();
		int n1=0,n2=1;
		System.out.println("Recursive Fibonacci Series");
		System.out.print(n1+" "+n2);
		ob.printFibonacciRecursion(n,n1,n2);
		System.out.println("\n");
		System.out.println("Non-Recursive Fibonacci Series");
		System.out.print(n1+" "+n2);
		ob.printFibonacci(n,n1,n2);
			
	}
	  
}
