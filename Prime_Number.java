package lab1;
import java.util.*;
public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i,j;
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		System.out.println("All prime numbers between "+num+" is :");
		for(i=2;i<=num;i++)
		{	int count=0; 
			for(j=2;j<=(i/2);j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==0)
				System.out.print(" "+i+" ");
		}
	}
}
