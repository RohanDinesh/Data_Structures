
import java.util.Scanner;

public class queue{
	 public static int rear=-1;
	 public static int front=0;
	 public static int item;
	 int[] q = new int[5];
    Scanner s = new Scanner(System.in);

    void add(int item)
    {
        if(rear == 4)
            System.out.println("queue overflow");

        else
        {
        	rear++;
            q[rear]=item;
            
        }
    }
    
    void delete()
    {
        if(front > rear)
            System.out.println("queue underflow");

        else
        {
            System.out.println("deleted item is" +q[front]);
            front++;
        }
    }

    void display()
    {
        if(front > rear)
            System.out.println("queue is empty");

        else
        {
        	System.out.println("Elements are:");
            for(int i=front;i<=rear;i++)
                System.out.print(q[i]+  " ");
        }
    }
}