import java.util.Scanner;
public class CLL31
{
	class Node
	{
		Node next;
		int data;
		Node(int data)
		{
			this.next = null;
			this.data = data;
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
			tail.next = head;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	public void addNodeStart()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the data you want to add at Starting");
		int d = scr.nextInt();
		Node newNode = new Node(d);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
			tail.next = head;
		}
		else
		{
			newNode.next = head;
			tail.next = newNode;
			head = newNode;
		}
	}
	public void addFromMid(int n)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the data you want to add in middle:- ");
		int d = scr.nextInt();
		Node newNode = new Node(d);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
			tail.next = head;
		}
		else
		{
			int count = (n%2==0)?(n/2):((n+1)/2);
			Node current = head;
			Node previous = null;
			for(int i=0;i<count;i++)
			{
				previous = current;
				current = current.next;
			}
			previous.next = newNode;
			newNode.next = current;
		}
	}
	public void display()
	{
		if(head == null)
		{
			System.out.println("There are no nodes present in the list to display");
			return;
		}
		Node current = head;
		while(current != tail)
		{
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println(current.data+" --> head ");
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		CLL31 cl = new CLL31();
		System.out.println("Enter no. of nodes");
		int n = scr.nextInt();
		int x =0;
		for(int i=0;i<n;i++)
		{
			x = scr.nextInt();
			cl.addNode(x);
		}
		cl.display();
		cl.addNodeStart();
		cl.display();
		cl.addFromMid(n);
		cl.display();
	}
}
