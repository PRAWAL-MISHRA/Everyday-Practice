import java.util.Scanner;
public class LL2
{
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void display()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("No node exist in the list");
			return;
		}
		int count = 0;
		System.out.println("The nodes are:- ");
		while(current.next != null)
		{
			count++;
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println(current.data);
		System.out.println("The total no. of nodes in the list are "+(count+1));
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		LL2 l = new LL2();
		System.out.println("Enter the no.of nodes:-");
		int n = scr.nextInt();
		int x=0;
		for(int i=0;i<n;i++)
		{
			x =  scr.nextInt();
			l.addNode(x);
		}
		l.display();
	}
}
