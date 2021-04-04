package lab1;
import java.util.*;
public class Calculate_Sum_5 {
	public int calculateSum(int n)
	{
		int i,sum=0;
		for(i=3;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Calculate_Sum_5 ob=new Calculate_Sum_5();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int s=ob.calculateSum(n);
		System.out.println("Sum is : "+s);
	}
}
