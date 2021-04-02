package lab1;
import java.util.*;
public class Traffic_light {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Red light \nEnter 2 for Yellow light \nEnter 3 for Green light");
		int select=sc.nextInt();
		switch(select)
		{
		case 1:
			System.out.println("STOP");
			break;
		case 2:
			System.out.println("READY");
			break;
		case 3:
			System.out.println("GO");
			break;
		default:
			System.out.println("Wrong Input");
		}
	}

}
