import java.util.Scanner;
public class DLL17
{
	class Node
	{
		int data;
		Node previous;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.previous = null;
			this.next = null;
		}
	}
	Node head, tail = null;
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
			head = tail = newNode;
		else
		{
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		}
	}
	public void display()
	{
		if(head == null)
		{
			System.out.println("There are no nodes present in the list.");
			return;
		}
		Node current = head;
		while(current.next != null)
		{
			System.out.print(current.data+" <--> ");
			current = current.next;
		}
		System.out.println(current.data);
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		DLL17 dl = new DLL17();
		System.out.println("Enter the number of nodes: ");
		int n = scr.nextInt();
		System.out.println("Enter the Nodes gradually: ");
		int x = 0;
		for(int i=0;i<n;i++)
		{
			x = scr.nextInt();
			dl.addNode(x);
		}
		dl.display();
	}
}
