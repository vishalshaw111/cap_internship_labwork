package lab1;
import java.util.*;
public class Sum_of_cubes {
	public int calculateSum(int n)
	{
		int sum=0;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+(rem*rem*rem);
		}
		return sum;
	}
	public static void main(String[] args) {
		Sum_of_cubes ob =new Sum_of_cubes();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum= ob.calculateSum(n);
		
		System.out.println("Sum of the cubes of the digits is "+sum);
	}
}
