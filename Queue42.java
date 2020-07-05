import java.util.Scanner;
public class Queue42
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
	public Node front = null;
	public Node rear = null;
	public void Insert()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the data: ");
		int d = scr.nextInt();
		Node newNode = new Node(d);
		if(front == null)
		{
			front = newNode;
			rear = newNode;
		}
		else
		{
			rear.next = newNode;
			rear = newNode;
		}
		display();
	}
	public void delete()
	{
		if(front == null)
		{
			System.out.println("Queue is Empty");
			return;
		}
		else if(front != rear)
		{
			System.out.println(front.data+" being the first element is deleted.");
			Node current = front.next;
			front.next = null;
			front = current;
		}
		else
			front = rear = null;
		display();
	}
	public void display()
	{
		if(front == null)
		{
			System.out.println("Queue is empty");
			return;
		}
		Node current = front;
		while(current != null)
		{
			System.out.print("-[ "+current.data+" ]-");
			current = current.next;
		}
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		Queue42 st = new Queue42();
		System.out.println("*********Queue operations using Linked List*********\n");  
	    System.out.println("\n------------------------------------------------\n");
	    int choice = 0;
	    System.out.println("\nChose one from the below options...\n");  
        System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit");
        while(choice !=4)
        {
        	System.out.println("\nEnter your Choice: ");
        	choice = scr.nextInt();
        	switch(choice)
        	{
        	case 1:
        	{
        		st.Insert();
        		break;
        	}
        	case 2:
        	{
        		st.delete();
        		break;
        	}
        	case 3:
        	{
        		st.display();
        		break;
        	}
        	case 4:
        	{
        		System.out.println("Exiting............................................ Exit ! ! ");
        		System.exit(0);
        	}
        	default:
        		System.out.println("CHOICE INVALID !! Please enter a valid choice.");
        	}
        }
	}
}
