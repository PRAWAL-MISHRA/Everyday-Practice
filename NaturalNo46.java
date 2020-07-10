import java.util.Scanner;
public class NaturalNo46
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n = scr.nextInt();
		System.out.print("The natural numbers till "+n+" are: ");
		for(int i=1;i<n;i++)
			System.out.print(i+" ,");
		System.out.println(n);
	}
}
