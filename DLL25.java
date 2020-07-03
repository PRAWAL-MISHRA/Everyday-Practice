import java.util.Scanner;
public class DLL25
{
	class Node
	{
		int data;
		Node next;
		Node previous;
		Node(int data)
		{
			this.previous = null;
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
		}
		else
		{
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		}
	}
	public void addNodeStart()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the node data: ");
		int data = scr.nextInt();
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
	}
	public void addNodeMid(int n)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the node data: ");
		int data = scr.nextInt();
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			int s = (n%2 == 0)?(n/2):((n+1)/2);
			Node current = head;
			Node temp = null;
			for(int i=1;i<n;i++)
				current = current.next;
			temp = current.next;  
	        temp.previous = current;
	        current.next = newNode;  
	        newNode.previous = current;  
	        newNode.next = temp;  
	        temp.previous = newNode;
			
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
			current.previous = null;
			head.next = null;
			head = current;
		}
		else
			head = tail = null;
	}
	public void DeleteFromEnd()
	{
		if(head == null)
		{
			System.out.println("There are no nodes to delete from end");
			return;
		}
		else if(head != tail)
		{
			Node current = tail.previous;
			current.next = null;
			tail.previous = null;
			tail = current;
		}
		else
			head = tail = null;
	}
	public void deleteFromMid(int size)
	{
		if(head == null)
            return;
        else
        {
            Node current = head;
            int mid = (size % 2 == 0) ? (size/2) : ((size+1)/2);
            for(int i = 1; i < mid; i++)
                current = current.next; 
            if(current == head)
                head = current.next; 
            else if(current == tail)  
                tail = tail.previous;
            else
            {
                current.previous.next = current.next;  
                current.next.previous = current.previous;  
            }  
            current = null;  
        }
	}
	public void reverse()
	{
		Node temp = null;
		Node current = head;
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
	public void display()
	{
		if(head == null)
		{
			System.out.println("There are no nodes to display");
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
	public void max()
	{
		if(head == null)
		{
			System.out.println("There are no nodes in the list to find max");
			return;
		}
		int max = head.data;
		Node current = head;
		while(current != null)
		{
			if(max < current.data)
				max = current.data;
		}
		System.out.println("The max nodes in the list "+max);
	}
	public void min()
	{
		if(head == null)
		{
			System.out.println("There are no nodes in the list to find min");
			return;
		}
		int min = head.data;
		Node current = head;
		while(current != null)
		{
			if(min > current.data)
				min = current.data;
		}
		System.out.println("The min nodes in the list "+min);
	}
	public void Search()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the data to search: ");
		int d = scr.nextInt();
		Node current = head;
		while(current != null)
		{
			if(current.data == d)
			{
				System.out.println("The data is present in the list");
				return;
			}
		}
		System.out.println("The data is not present in the list");
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		DLL25 dl = new DLL25();
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
		dl.deleteFromStart();
		dl.display();
		dl.DeleteFromEnd();
		dl.display();
		dl.deleteFromMid(n);
		dl.display();
		dl.max();
		dl.min();
		dl.addNodeStart();
		dl.display();
		dl.addNodeMid(n);
		dl.display();
		dl.Search();
	}
}