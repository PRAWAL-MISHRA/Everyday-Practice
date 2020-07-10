import java.util.Scanner;
public class Rev56
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scr.nextInt();
		int num = 0;
		while(n>0)
		{
			int dig = n%10;
			num = (num*10) + dig;
			n/=10;
		}
		System.out.println("The reversed number : "+num);
	}
}
