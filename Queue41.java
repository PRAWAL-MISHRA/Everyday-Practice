import java.util.Scanner;
public class Queue41
{
	int size = 15;
	int queue[] = new int[size];
	int front = -1;
	int rear = -1;
	public void insert()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter your Data: ");
		int data = scr.nextInt();
		if(rear == (size-1))
		{
			System.out.println("Queue has Overflowed!!!");
			return;
		}
		else if(front == -1 && rear == -1)
			front = rear = 0;
		else
			rear = rear+1;
		queue[rear] = data;
		display();
	}
	public void delete()
	{
		if(front == -1 || front>rear)
		{
			System.out.println("Queue has Underflown!!!");
			return;
		}
		else
		{
			System.out.println(queue[front]+" is being deleted from the queue.");
			if(front == rear)
				front = rear = -1;
			else
				front = front +1;
		}
		display();
	}
	public void display()
	{
		if(rear == -1)
			System.out.println("The Queue is Empty");
		else
		{
			System.out.println("The queue is:");
			for(int i = front;i<=rear;i++)
				System.out.print("-[ "+queue[i]+" ]-");
		}
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		Queue41 st = new Queue41();
		System.out.println("*********Queue operations using array*********\n");  
	    System.out.println("\n------------------------------------------------\n");
	    int choice = 0;
	    System.out.println("\nChose one from the below options...\n");  
        System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit"); 
	    while(choice !=4)
	    { 
	        System.out.println("\n Enter your choice \n");
	    	choice = scr.nextInt();
	    	switch(choice)
	    	{
	    	case 1:
	    	{
	    		st.insert();
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
	    		System.out.println("Exiting...................... Exited.");
	    		System.exit(0);
	    	}
	    	default:
	    		System.out.println("Please enter a valid choice");
	    	}
	    }
	}
}
