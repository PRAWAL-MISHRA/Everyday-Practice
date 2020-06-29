import java.util.Scanner;
public class LL6
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
		if(head==null)
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
		if(head == null)
		{
			System.out.println("There are no nodes to display.");
			return;
		}
		Node current = head;
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
		while(current != null)
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
			System.out.println("There are no nodes to delete from Start");
			return;
		}
		else if(head != tail)
		{
			Node current = head;
			head = head.next;
			current.next = current = null;
		}
		else
		{
			head = tail = null;
		}
	}
	public void deleteFromEnd()
	{
		if(head == null)
		{
			System.out.println("There are no nodes to delete from end");
			return;
		}
		else if(head != tail)
		{
			Node current = head;
			while(current.next != tail)
				current = current.next;
			tail = current;
			tail.next = null;
		}
		else
			head = tail = null;
	}
	public void deleteFromMid(int n)
	{
		Node current = null;
		Node temp = null;
		if(head == null)
		{
			System.out.println("There are no nodes to delete from mid");
			return;
		}
		else
		{  
	        int count = (n % 2 == 0) ? (n/2) : ((n+1)/2);  
	        if( head != tail )
	        {  
	            temp = head;  
	            current = null; 
	            for(int i = 0; i < count-1; i++)
	            {  
	                current = temp;  
	                temp = temp.next;  
	            }                  
	            if(current != null)
	            {
	                current.next = temp.next; 
	                temp = null;  
	            }
	            else
	            {  
	                head = tail = temp.next; 
	                temp = null;  
	            }      
	        }
		}
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		LL6 l = new LL6();
		System.out.println("Enter the number of nodes in the list: ");
		int n = scr.nextInt();
		int x=0;
		for(int i=0; i<n;i++)
		{
			x = scr.nextInt();
			l.addNode(x);
		}
		l.display();
		l.reverse();
		l.display();
		l.deleteFromStart();
		l.display();
		l.deleteFromEnd();
		l.display();
		l.deleteFromMid(n);
		l.display();
	}
}