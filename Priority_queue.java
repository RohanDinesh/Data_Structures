package priority_queue;

import java.util.Arrays;

public class Priority_queue {
	int size=5;
	int q[] = new int[size];
	int n=0;
	int i;
	
	void insert(int item)
	{
		/*if(rear==size-1)
			{
				System.out.println("overflow");
				return;
			}*/
		
		if(n==0)
		{
			
			q[0]=item;
			n++;
			return;
		}
		
		for(i=n-1;i>=0;i--)
		{
			if(item>q[i])
			{
				q[i+1]=q[i];
			}
			else
			{
				break;
			}
		}
		q[i+1]=item;
		n++;

	}

	
	void delete()
	{
		//if(front > rear)
          //  System.out.println("queue underflow");

        //else
        {
        	n--;
            System.out.println("deleted item is" +q[n]);
            //n--;
        }
		
	}
	
	boolean isfull()
	{
		if(size==n)
			return true;
		else
			return false;
	}
	
	boolean isempty()
	{
		if(n==0)
			return true;
		else
			return false;
			
	}
	
	void display()
	{
		//if(front > rear)
           // System.out.println("queue is empty");
		//else
		{
			System.out.println("content of queue is");
			for(int i=0;i<=n-1;i++)
				System.out.print(q[i]+ " ");
			
			System.out.println();
			System.out.println(Arrays.toString(q));
		}
	}
}
