package lab1;
import java.util.*;
public class Calculate_the_difference {
	public int calculateDifference(int n)
	{
		int i,sum=0,sum1=0,sum2=0;
		for(i=1;i<=n;i++)
		{
			sum1=sum1+(i*i);
			sum2=sum2+i;
		}
		sum=sum1-(sum2*2);
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculate_the_difference ob=new Calculate_the_difference();
		int n,s;
		System.out.println("Enter the number :");
		n=sc.nextInt();
		s=ob.calculateDifference(n);
		System.out.println("Sum is :"+s);
	}

}
