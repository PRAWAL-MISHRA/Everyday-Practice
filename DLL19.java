import java.util.Scanner;
public class DLL19
{
	class Node
	{
		int data;
		Node previous;
		Node next;
		Node(int data)
		{
			this.next = null;
			this.data = data;
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
			System.out.println("There are no nodes in the list to display");
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
	public void deleteFromBeg()
	{
		if(head == null)
		{
			System.out.println("There are no nodes to delete in the list");
			return;
		}
		else if(head != tail)
		{
			Node current = head.next;
			current.previous = null;
			head.next = null;
			head = current;
			current = null;
		}
		else
		{
			head = tail = null;
		}
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		DLL19 dl= new DLL19();
		System.out.println("Enter the no. of nodes");
		int n = scr.nextInt();
		System.out.println("Enter the nodes gradually: ");
		int x = 0;
		for(int i=0;i<n;i++)
		{
			x = scr.nextInt();
			dl.addNode(x);
		}
		dl.display();
		dl.reverse();
		dl.display();
		dl.deleteFromBeg();
		dl.display();
	}
}
