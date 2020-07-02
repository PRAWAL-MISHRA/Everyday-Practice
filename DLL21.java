import java.util.Scanner;
public class DLL21
{
	class Node
	{
		int data;
		Node next = null;
		Node previous = null;
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
	public void reverse()
	{
		Node current = head;
		Node temp = null;
		while(current !=  null)
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
			System.out.println("There are no nodes in the list to display.");
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
	public void DeleteFromStart()
	{
		if(head == null)
		{
			System.out.println("There are no nodes in the string to delete from Start.");
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
	public void deleteFromEnd()
	{
		if(head == null)
		{
			System.out.println("There are no nodes to delete from end.");
			return;
		}
		else if(head != null)
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
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		DLL21 dl = new DLL21();
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
		dl.DeleteFromStart();
		dl.display();
		dl.deleteFromEnd();
		dl.display();
		dl.deleteFromMid(n);
		dl.display();
	}
}
