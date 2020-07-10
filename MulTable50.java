import java.util.Scanner;
public class MulTable50
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scr.nextInt();
		for(int i=0;i<=n;i++)
			System.out.println(n+" x "+i+" = "+(n*i));
	}
}
