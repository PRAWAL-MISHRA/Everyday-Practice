import java.util.Scanner;
public class Stack40
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
	public Node top = null;
	public void push()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter your data");
		int d = scr.nextInt();
		Node newNode = new Node(d);
		if(top == null)
			top = newNode;
		else 
		{
			newNode.next = top;
			top = newNode;
		}
		show();
	}
	public void pop()
	{
		if(top == null)
			System.out.println("The stack is empty");
		else
		{
			System.out.println(top.data+" being the uppermost in the stack is popped out.");
			Node current = top.next;
			top.next = null;
			top = current;
		}
		show();
	}
	public void show()
	{
		if(top == null)
			System.out.println("The stack is empty");
		else
		{
			Node current = top;
			while(current != null)
			{
				System.out.println(" [ "+current.data+" ]");
				current = current.next;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		Stack40 st = new Stack40();
		System.out.println("*********Stack operations using array*********\n");  
	    System.out.println("\n------------------------------------------------\n");
	    int choice = 0;
	    System.out.println("\nChose one from the below options...\n");  
        System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
        while(choice !=4)
        {
        	System.out.println("Enter your Choice: ");
        	choice = scr.nextInt();
        	switch(choice)
        	{
        	case 1:
        	{
        		st.push();
        		break;
        	}
        	case 2:
        	{
        		st.pop();
        		break;
        	}
        	case 3:
        	{
        		st.show();
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
