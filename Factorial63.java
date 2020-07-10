import java.util.Scanner;
public class Factorial63
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scr.nextInt();
		int fac=1;
		for(int i=1;i<=n;i++)
			fac*=i;
		System.out.println("The factorial of number "+n+" is "+fac);
	}
}
