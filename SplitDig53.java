import java.util.Scanner;
public class SplitDig53
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String n = scr.next();
		char ch[] = n.toCharArray();
		for(int i=0;i<ch.length-1;i++)
			System.out.print(ch[i]+" ,");
		System.out.println(ch[ch.length-1]);
	}
}
