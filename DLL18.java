import java.util.Scanner;
public class DLL18
{
	class Node
	{
		int data;
		Node next;
		Node previous;
		Node(int data)
		{
			this.data = data;
			this.next = null;
			this.previous = null;
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
			newNode.previous = tail;
			tail = newNode;
		}
	}
	public void display()
	{
		if(head == null)
		{
			System.out.println("There are no nodes in the list.");
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
	public void reverse()
	{
		Node current = head;
		Node temp = null;
		while(current != null)
		{
			temp = current.next;
			current.next = current.previous;
			current.previous = temp;
			current = current.previous;
		}
		temp = head;
		head = tail;
		tail = temp;
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		DLL18 dl = new DLL18();
		System.out.println("Enter the no. of nodes: ");
		int n = scr.nextInt();
		int x = 0;
		System.out.println("Enter the nodes gradually.");
		for(int i=0;i<n;i++)
		{
			x = scr.nextInt();
			dl.addNode(x);
		}
		dl.display();
		dl.reverse();
		dl.display();
	}
}