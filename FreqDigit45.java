import java.util.Scanner;
public class FreqDigit45
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = scr.nextInt();
		int arr[] = new int [n];
		System.out.println("enter the values in the array: ");
		for(int i=0;i<n;i++)
			arr[i] = scr.nextInt();
		for(int i=0;i<n;i++)
			count(arr, arr[i]);
	}
	public static void count(int arr[], int n)
	{
		int count=0;
		if(n==0)
			return;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				arr[i]=0;
				count++;
			}
		}
		System.out.println("The frequency of "+n+" is "+count);
	}
}
