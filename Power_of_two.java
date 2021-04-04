package lab1;
import java.util.*;
public class Power_of_two {
	public boolean checkNumber(int n)
	{
		if(n==0)
		    return false;
		 
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
		       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
		
	}
	public static void main(String[] args) {
		Power_of_two ob=new Power_of_two();
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		boolean ans=ob.checkNumber(num);
		if(ans)
	        System.out.println(num+" is a power of 2 ");
	     else
	        System.out.println(num+" is not a power of 2 ");
	}

}
