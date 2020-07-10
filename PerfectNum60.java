import java.util.Scanner;
public class PerfectNum60
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scr.nextInt();
		int sum = 0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum == n)
			System.out.println("The number is a Perfect Number");
		else
			System.out.println("The number is not a perfect number");
	}
}
