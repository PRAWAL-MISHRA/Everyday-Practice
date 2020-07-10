import java.util.Scanner;
public class IsPrime58
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scr.nextInt();
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i == 0)
				count++;
		}
		if(count == 2)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not prime");
	}
}
