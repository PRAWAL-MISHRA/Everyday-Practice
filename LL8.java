import java.util.Scanner;
public class LL8
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
	public Node reverseList(Node temp)
	{  
		Node current = temp;  
	    Node prevNode = null, nextNode = null;  
	    while(current != null)
	    {  
	    	nextNode = current.next;  
	        current.next = prevNode;  
	        prevNode = current;  
	        current = nextNode;  
	    }  
	    return prevNode;
	}
	public void isPalindrome(int size)
	{  
	        Node current = head;  
	        boolean flag = true;
	        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);    
	        for(int i=1; i<mid; i++)
	        	current = current.next;
	        Node revHead = reverseList(current.next);
	        while(head != null && revHead != null)
	        {
	        	if(head.data != revHead.data)
	        	{  
	                flag = false;  
	                break;  
	            }  
	            head = head.next;  
	            revHead = revHead.next;  
	        }
	        if(flag)  
	            System.out.println("Given singly linked list is a palindrome");  
	        else
	            System.out.println("Given singly linked list is not a palindrome");  
	}
	public void Min()
	{
		if(head == null)
		{
			System.out.println("There are no nodes in list to find Min.");
			return;
		}
		Node current = head;
		int min = current.data;
		while(current != null)
		{
			if(min>current.data)
				min = current.data;
			current = current.next;
		}
		System.out.println("The least node of List is "+min);
	}
	public void Max()
	{
		if(head == null)
		{
			System.out.println("There are no nodes in list to find Max");
			return;
		}
		Node current = head;
		int max = current.data;
		while(current != null)
		{
			if(max < current.data)
				max = current.data;
			current = current.next;
		}
		System.out.println("The Maximum node of list is "+max);
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		LL8 l = new LL8();
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
		l.isPalindrome(n);
		l.display();
		l.Max();
		l.Min();
	}
}