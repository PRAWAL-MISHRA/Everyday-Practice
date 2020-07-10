import java.util.Scanner;
public class Strong62
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = scr.nextInt();
		int dig = 0 , fac = 0 , sum=0, temp=n;
		while(n>0)
		{
			dig = n%10;
			fac = factorial(dig);
			sum+=fac;
			n/=10;
		}
		if(temp == sum)
			System.out.println("This is a Strong Number");
		else
			System.out.println("This is not a Strong number");
	}
	public static int factorial(int n)
	{
		int fac = 1;
		for(int i=1;i<=n;i++)
			fac*=i;
		return fac;
	}
}
