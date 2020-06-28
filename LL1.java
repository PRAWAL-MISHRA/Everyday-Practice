import java.util.Scanner;
public class LL1
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
			System.out.println("There are no nodes in the list.");
			return;
		}
		System.out.println("Nodes in a single linked list are:-");
		while(current.next != null)
		{
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println(current.data);
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		LL1 l = new LL1();
		System.out.println("Enter the number of nodes: ");
		int n = scr.nextInt();
		int x = 0;
		for(int i=0;i<n;i++)
		{
			x = scr.nextInt();
			l.addNode(x);
		}
		l.display();
	}
}