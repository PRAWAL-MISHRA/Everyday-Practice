import java.util.Scanner;
public class Swap52
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int n = scr.nextInt();
		System.out.println("Enter the 2nd number: ");
		int m = scr.nextInt();
		System.out.println("Numbers before swap are "+n+" and "+m);
		n = n+m;
		m = n-m;
		n = n-m;
		System.out.println("Numbers after the swap are "+n+" and "+m);
	}
}
