import java.util.Scanner;
public class Prime59
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scr.nextInt();
		for(int i=1;i<=n;i++)
			isPrime(i);
	}
	public static void isPrime(int n)
	{
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.print(n+" ,");
	}
}
