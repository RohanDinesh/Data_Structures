package LinkedList;

public class runLinkedList {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		//ll.deletebydata(50);
		ll.insertpos(10,1);
		ll.insertpos(20,2);
		ll.insertpos(30,3);
		ll.insertpos(40,4);
		ll.insertlast(50);
		ll.insertlast(60);
		ll.display();
		//ll.delete();
		//ll.display();
		ll.deleteatend();
		ll.display();
		ll.deletebydata(30);
		ll.display();
		
		System.out.println("reverse of above linked list is:");
		ll.reverse();
		ll.display();
		
		
		
		
		/*ll.insert(10);
		ll.insert(20);
		ll.insertlast(30);
		ll.insertpos(25, 5);
		ll.insertlast(50);
		ll.display();
		ll.delete();
		//System.out.println("ll items added");
		ll.display();
		*/
		
		

	}

}
