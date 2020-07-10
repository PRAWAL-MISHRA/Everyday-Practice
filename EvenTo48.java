import java.util.Scanner;
public class EvenTo48
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = scr.nextInt();
		if(n<2)
			System.out.println("No even numbers are found");
		for(int i=2;i<=n;i++)
			if(i%2==0)
				System.out.print(i+" ,");
	}
}
