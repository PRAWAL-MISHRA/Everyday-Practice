import java.util.Scanner;
public class LL4
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
			System.out.println("There are no nodes in this list to display.");
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
		tail = head;
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
	public void deleteFromStart()
	{
		if(head == null)
		{
			System.out.println("There are no nodes in the list to delete.");
			return;
		}
		else if(head != tail)
		{
			Node current = head;
			head = head.next;
			current.next = null;
			current = null;
		}
		else
		{
			head = null;
			tail = null;
		}
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		LL4 l = new LL4();
		System.out.println("Enter the number of nodes: ");
		int n = scr.nextInt();
		int x = 0;
		for(int i=0;i<n;i++)
		{
			x = scr.nextInt();
			l.addNode(x);
		}
		l.display();
		l.reverse();
		l.display();
		System.out.println(l.head.data+"   "+l.tail.data);
		l.deleteFromStart();
		l.display();
	}
}