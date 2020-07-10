import java.util.Scanner;
public class Palindrome57
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scr.nextInt();
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			int dig = n%10;
			sum = (sum*10)+dig;
			n/=10;
		}
		if(temp == sum)
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not palindrome");
	}
}
