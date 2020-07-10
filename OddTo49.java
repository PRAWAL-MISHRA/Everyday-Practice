import java.util.Scanner;
public class OddTo49
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n = scr.nextInt();
		if(n<1)
			System.out.println("No odd numbers found");
		for(int i=1;i<=n;i++)
			if(i%2!=0)
				System.out.print(i+" ,");
	}
}
