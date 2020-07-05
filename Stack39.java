import java.util.Scanner;
public class Stack39
{
	int top = -1;
	int size = 5;
	int arr[] = new int[size];
	public boolean isEmpty()
	{
		return(top<0);
	}
	public boolean isFull()
	{
		return (top>=(size-1));
	}
	public void show()
	{
		if(isEmpty())
			System.out.println("The stack is empty");
		else
		{
			for(int i=top;i>=0;i--)
				System.out.println(" [ "+arr[i]+" ] ");
		}
	}
	public void pop()
	{
		if(isEmpty())
			System.out.println("The Stack is empty");
		else
		{
			System.out.println(arr[top]+" being the uppermost in the stack is popped out");
			arr[top] = 0;
			top--;
		}
		show();
	}
	public void push()
	{
		if(isFull())
			System.out.println("There is no more space in the stack for the new entry");
		else
		{
			Scanner scr = new Scanner(System.in);
			System.out.println("Enter the new Entry");
			int data = scr.nextInt();
			top++;
			arr[top] = data;
		}
		show();
	}
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		Stack39 st = new Stack39();
		System.out.println("*********Stack operations using array*********\n");  
	    System.out.println("\n------------------------------------------------\n");
	    int choice = 0;
	    System.out.println("\nChose one from the below options...\n");  
        System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit"); 
	    while(choice !=4)
	    { 
	        System.out.println("\n Enter your choice \n");
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
	    		System.out.println("Exiting...................... Exited.");
	    		System.exit(0);
	    	}
	    	default:
	    		System.out.println("Please enter a valid choice");
	    	}
	    }
	}
}