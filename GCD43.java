import java.util.Scanner;
public class GCD43
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter your 1st number: ");
		int n = scr.nextInt();
		System.out.println("Enter your 2nd number: ");
		int m = scr.nextInt();
		int gcd = 1;
		for(int i = 1; i <= n && i <= m; ++i)
		{
			if(n%i==0 && m%i==0)
				gcd = i;
		}
		System.out.println("GCD of 2 numbers is: "+gcd);
	}
}
