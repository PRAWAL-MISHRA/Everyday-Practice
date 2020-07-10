import java.util.Scanner;
public class Swap51
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int n = scr.nextInt();
		System.out.println("Enter the 2nd number: ");
		int m = scr.nextInt();
		System.out.println("Numbers before swap are "+n+" and "+m);
		int temp = n;
		n = m;
		m = temp;
		System.out.println("Numbers after the swap are "+n+" and "+m);
	}
}
