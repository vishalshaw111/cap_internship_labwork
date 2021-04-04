package lab1;
import java.util.*;
public class Increasing_number {
	public boolean checkNumber(int n)
	{	
		int currentDigit = n % 10;
		boolean flag=false;
		n = n/10;
		while(n>0)
    	{
			if(currentDigit <= n % 10)
    		{
    			flag = true;
    			break;
    		}
    		currentDigit = n % 10;
    		n = n/10;
    	}
     return flag;
	}
	public static void main(String[] args) {
		Increasing_number ob=new Increasing_number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		boolean ans=ob.checkNumber(n);
		if(ans)
	        System.out.println(n+" is not an increasing number ");
	     else
	        System.out.println(n+" is an increasing number ");
	}
}
