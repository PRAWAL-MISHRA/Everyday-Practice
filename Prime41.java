import java.util.Scanner;
public class Prime41
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scr.nextInt();
		System.out.println("All prime numbers till "+n+" are:-");
		for(int i=2; i<n; i++)
			isPrime(i);
	}
	public static void isPrime(int i)
	{
		int count = 0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				count++;
		}
		if(count==2)
			System.out.print(i+", ");
	}
}
