import java.util.Scanner;
public class LCM42 
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int n = scr.nextInt();
		System.out.println("Enter the 2nd number: ");
		int m = scr.nextInt();
		int lcm=0;
		lcm = (n>m)?n:m;
		while(true)
		{
			if(lcm%n==0 && lcm%m==0)
			{
				System.out.println("The lcm is "+lcm);
				break;
			}
			++lcm;
		}
	}
}
