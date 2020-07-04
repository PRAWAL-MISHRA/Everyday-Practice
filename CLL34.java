import java.util.Scanner;
public class CLL34
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
	public void deleteFromStart()
	{
		if(head == null)
		{
			System.out.println("There are no nodes in the list to delete from start");
			return;
		}
		else if(head != tail)
		{
			Node current = head.next;
			tail.next = current;
			head.next = null;
			head = current;
		}
		else
			head = tail = null;
	}
	public void deleteFromEnd()
	{
		if(head == null)
		{
			System.out.println("There are no nodes in the list to delete from end");
			return;
		}
		else if(head != tail)
		{
			Node current = head;
			while(current.next !=tail)
				current = current.next;
			tail.next = null;
			current.next = head;
			tail = current;
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
	        if(head != tail)
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
		CLL34 cl = new CLL34();
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
		cl.deleteFromStart();
		cl.display();
		cl.deleteFromEnd();
		cl.display();
		cl.deleteFromMid(n);
		cl.display();
	}
}