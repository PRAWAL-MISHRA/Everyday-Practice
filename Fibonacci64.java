import java.util.Scanner;
public class Fibonacci64
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number range: ");
		int n = scr.nextInt();
		int t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
	}
}
