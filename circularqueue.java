import java.util.Scanner;

public class circularqueue {
	static int rear=-1;
	static int front=0;
	static int size=5;
	static int[] cq = new int[size];
	static int item;
	static int count=0;
	public static int a;
	
	static void insert(int item) 
	{
		//cq[rear]=item;
		rear = (rear +1)%size;
		cq[rear]=item;
		count++;

	}
	
	static void delete()
	{
	if(count==0)
		System.out.println("queue is empty");

	else
		{
			System.out.println("deleted item is "+ cq[front]);
			front=(front+1)%size;
			count--;
		}
	}
	
	static void display()
	{
		if(count==0)
			System.out.println("circular queue is empty");
		
		else
		{	int j=front;
			for(int i=1;i<=count;i++)
				{
					System.out.println(cq[j] +" ");
					j=(j+1)%size;
				}
				
			
		}
	}
	
	
	
	public static void main(String[] args)
	{
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		for(;;)
		{
			System.out.println("Enter 1:Insert 2:Delete 3:Display else exit");
			a=s.nextInt();
			
			switch(a) 
			{
			case 1: System.out.println("Enter item");	
					item = s.nextInt();
					insert(item);
					break;
					
			case 2: delete();
					break;
					
			case 3:display();
					break;
					
			default: return;		
					
					
			 
			}
			
			
		}
	}

}
