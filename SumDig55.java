import java.util.Scanner;
public class SumDig55
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scr.nextInt();
		int sum = 0;
		while(n>0)
		{
			sum+=n%10;
			n/=10;
		}
		System.out.println("Sum of digits are = "+sum);
	}
}
