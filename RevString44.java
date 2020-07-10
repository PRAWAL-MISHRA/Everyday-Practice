import java.util.Scanner;
public class RevString44
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = scr.nextLine();
		char ch[] = str.toCharArray();
		String stri = "";
		for(int i = ch.length-1; i>=0;i--)
			stri+=ch[i];
		System.out.println("The reversed string is : "+stri);
	}
}
