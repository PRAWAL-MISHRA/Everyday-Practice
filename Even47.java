import java.util.Scanner;
public class Even47
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scr.nextInt();
		if(n%2==0)
			System.out.println(n+" is even.");
		else
			System.out.println(n+" is odd");
	}
}
