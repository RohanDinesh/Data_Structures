package Doubly_LinkedList;

import java.util.Scanner;

public class Run_DoublyLL {
	public static void main(String[] args)
	{
		int ch,item,pos;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		DoublyLL ll = new DoublyLL();
		node first=null;
	
		for(;;)
		{
			System.out.println("Enter 1:insert 2:insert at a pos 3:insert at the last"
					+ "4:Delete 5:Delete by data 6:Delete at the end 7:Display");
			ch= s.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter item");
						item=s.nextInt();
						first=ll.insert(first,item);
						break;
						
				case 2: System.out.println("Enter item and pos");
						item=s.nextInt();
						pos=s.nextInt();
						first=ll.insertpos(first,item, pos);
						break;
						
				case 3: System.out.println("Enter item");
						item=s.nextInt();
						first=ll.insert(first,item);
						break;
						
				case 4: first=ll.delete(first);
						break;
						
				case 5: System.out.println("Enter item to be deleted");
						item=s.nextInt();
						first=ll.deletebydata(first,item);
						break;
						
				case 6: first=ll.deleteatend(first);
						break;
						
				case 7: first=ll.display(first);
						break;
						
				default: return;
	
			}
			
		}
	}

}
