import java.util.Scanner;
public class LL3
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
	public void adddNode(int data)
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
			System.out.println("There are no nodes in the list: ");
			return;
		}
		System.out.println("The nodes in the list are: ");
		while(current.next != null)
		{
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println(current.data);
	}
	public void reverse()
	{
		Node current = head;
		Node previous = null;
		Node Next = null;
		while(current!=null)
		{
			Next = current.next;
			current.next = previous;
			previous = current;
			current = Next;
		}
		head = previous;
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		LL3 l = new LL3();
		System.out.println("Enter the number of nodes: ");
		int n = scr.nextInt();
		int x =0;
		for(int i=0;i<n;i++)
		{
			x = scr.nextInt();
			l.adddNode(x);
		}
		l.display();
		l.reverse();
		l.display();
	}
}
