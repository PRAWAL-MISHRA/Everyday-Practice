import java.util.Scanner;
public class Armstrong61
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scr.nextInt();
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			int dig = n%10;
			sum+=(dig*dig*dig);
			n/=10;
		}
		if(sum == temp)
			System.out.println("The number is Armstrong Number");
		else
			System.out.println("The number is not Armstrong Number");
	}
}
