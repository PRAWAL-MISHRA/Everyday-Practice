import java.util.Scanner;
public class CountDig54
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scr.nextInt();
		int count = 0;
		while(n>0)
		{
			n/=10;
			count++;		
		}
		System.out.println("The number of digits in the number is "+ count);
	}
}
