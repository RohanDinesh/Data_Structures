package LinkedList;

public class LinkedList {
	node first;
	
	void insert(int item)
	{
		if(first==null) {
			node nn = new node();
			nn.info=item;
			//nn.link=null;
			first = nn;
		}
		
		else {
			node nn = new node();
			nn.info=item;
			nn.link=first;
			first=nn;
		}	
	}
	
	void insertlast(int item) {
		node nn = new node();
		nn.info=item;
		//nn.link=null;
		
		node pres=first;
		while(pres.link != null) {
			pres=pres.link;
		}
		pres.link=nn;
	}
	
	
	@SuppressWarnings("unused")
	void insertpos(int item,int pos)
	{
		if(pos==1)
		{
			insert(item);
			return;
		}
		
		
		
		int count=1;
		node nn = new node();
		nn.info=item;
		node pres=first;
		
		while(pres.link != null && count!=(pos-1)) 
		{
			pres=pres.link;
			count++;
		}
		nn.link=pres.link ;
		pres.link=nn;
		
		if(pres==null)
		{
			System.out.println("invalid position");
		}
	}
	
	
	void delete()
	{
		node pres=first;
		if(pres==null)
		{
			System.out.println("Unable to Delete: List is empty");
		}
		else {
			System.out.println("deleted item is " +pres.info);
			pres=pres.link;
		}
	}
	
	
	
	void deletebydata(int item)
	{
		node pres=first;
		if (first == null)
		{
			System.out.println ("List Underflow\n");
			return;
		}
		
		if(first.info==item)
		{
			System.out.println("deleted item is " +pres.info);
			pres=pres.link;
			return;
		}
		
		
		node prev = null;
		while(pres.info!=item)
		{
			prev=pres;
			pres=pres.link;
		}
		
		System.out.println("deleted item is " +pres.info);
		prev.link=pres.link;
		pres=pres.link;

	}
	
	void deleteatend()
	{
		if (first == null)
		{
			System.out.println ("List Underflow\n");
			return;
		}
		node prev = null;
		node pres=first;
		while(pres.link!=null)
		{
			prev=pres;
			pres=pres.link;
		}
		System.out.println("deleted item is " +pres.info);
		prev.link=null;
		pres=prev;
		
		
	}
	
	void display()
	{
		node pres=first;
		
		while(pres.link!=null)
		{
			System.out.print(pres.info +" ");
			pres=pres.link;
		}
		System.out.println(pres.info);
		
	}
	
	
	
	void reverse()
	{
		@SuppressWarnings("unused")
		node prev = null;
		node pres = first;
		node next = null;
		
		while(pres!=null)
		{
			next = pres.link;
			next.link=pres;
			prev=pres;
			pres=next;
		}
		first = pres;
		
		// copy
		//node pres=first;
		
		while(pres.link!=null)
		{
			System.out.print(pres.info +" ");
			pres=pres.link;
		}
		System.out.println(pres.info);
		
		
	}
	
	
}

	
	


