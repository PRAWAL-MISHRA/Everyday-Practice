import java.util.Scanner;
public class HelloWorld 
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter the word whom you want to say hello: ");
		String sc = scr.next();
		System.out.println("Hello "+sc);
	}
}
