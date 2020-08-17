package Doubly_LinkedList;

public class DoublyLL {
	node first;
	
	@SuppressWarnings("unused")
	node insert(node first,int item)
	{
		
		node nn = new node();
		nn.info=item;
				
		if(first == null)
		{
			first = nn;
		} 
		
		else
		{
			first.left=nn;
			nn.left=null;
			nn.right=first;
			first = nn;
		}
		while(first.left!=null)
		{
			first=first.left;
		}
		return first;
	}
	
	node insertpos(node first,int item, int pos)
	{
		if(pos==1)
		{
			insert(first,item);
			return first;
		}
		
		else
		{
			node nn = new node();
			node pres=first;
			node prev = null;
			nn.info=item;
			int count=1;
			
			while(pres!=null && count<=(pos-1))
			{
				prev=pres;
				pres=pres.right;
				count++;
			}
			
			if(pres==null)
			{
				System.out.println("invalid pos");
				return first;
			}
			//prev=pres;
			//pres=pres.right;
			prev.right=nn;
			nn.left=prev;
			nn.right=pres;
			pres.left=nn;
			return first;
		}
	}
	
	@SuppressWarnings("null")
	node insertlast(node first,int item)
	{
		node nn = new node();
		//node pres=first;
		node last=null;
		nn.info=item;
		
		if(first == null)
		{
			first = nn;
			return first;
		}
		
	else {
		/*while(pres.right!=null)
		{
			pres=pres.right;
		}
		
		pres.right=nn;
		nn.left=pres;
		nn.right=null;
		
		while(first.left!=null)
		{
			first=first.left;
		}*/
		
		last.right=nn;
		nn.left=last;
		last=nn;
		return first;
	}
	}	
	
	
	node delete(node first)
	{
		if (first==null)
		{
			System.out.println("underflow");
			return first;
		}
		
		else
		{
			node pres=first;
			System.out.println("deleted item is" +pres.info);
			pres=pres.right;
			first=pres;
			return first;
		}
	}
	
	node deletebydata(node first,int item)
	{
		//int x;
		//int found=0;
		node pres=first;
		/*
		 * while(pres!=null)
		{
			x=pres.info;
			pres=pres.right;
			
			if(item==x)
			{
				found=1;
			}
			
			if(found!=1)
			{
				System.out.println("data not found");
				return first;
			}
		}                  */
		
		
		
		if (first==null)
		{
			System.out.println("underflow");
			return first;
		}
		else
		{
			//node pres=first;
			node prev=null;
			while(pres.left!=null)
				pres=pres.left;
			
			if(pres.info==item)
			{
				first=first.right;
				System.out.println("deleted item is" +pres.info);
				prev=pres;
				pres=pres.right;
				prev.right=null;
				//pres.left=null;
				return first;

			}
			
			while(pres!=null && item!=pres.info)
			{
				prev=pres;
				pres=pres.right;
			}
			//pres=pres.left;
			System.out.println("deleted item is" +pres.info);

			
			if(pres.right!=null)
			{
				pres=pres.right;
				prev.right=pres;
				pres.left=prev;	
			}
			else
			{
				pres=prev;
				prev.right=null;
			}
			
			return first;
		}
		
	}
	
	node deleteatend(node first)
	{
		if (first==null)
		{
			System.out.println("underflow");
			return first;
		}
		else
		{
			node pres = first;
			node prev = null;
			
			while(pres.right!=null)
			{
				prev = pres;
				pres=pres.right;
			}
			System.out.println("deleted item is" +pres.info);
			prev.right=null;
			pres.left=null;
			return first;
		}
	}
	
	node display(node first)
	{
		if (first==null)
		{
			System.out.println("Doubly LinkedList is empty");
			return first;
		}
		else
		{
			
			System.out.println("Content of DLL is:");
			node pres = first;
			while(pres.right!=null)
			{
				System.out.print(pres.info +" ");
				pres=pres.right;
			}
			System.out.println(pres.info);
			return first;
		}
	}
}
