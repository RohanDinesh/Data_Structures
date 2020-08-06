
	public class Dynamic_stack {
	    public static int[] s = new int[5];
	    public static int top = -1;
	    public static int capacity = 2;
	    
	    
	    void push(int item) {
	    	if(top==(capacity-1))
	    		expand();
	        

	        else {
	            top++;
	            s[top] = item;
	        }
	    }

	    
	    private void expand() {
	    	
	    	int length = size();
	    	int[] ns = new int[(capacity*2)];
	    	capacity=capacity*2;
	   		System.arraycopy(s, 0, ns, 0, length);
	   		s=ns;
	   		
	    	}
			
	

		void pop() {
	        if (top < 0)
	            System.out.println(" stack is empty");
	        else {
	            System.out.println("item deleted is" + s[top]);
	            top--;
	            
	            if(size() <= (capacity/4))
	            {
	            	shrink();
	            }
	        }

	    }

	    private void shrink() {
	    	int length = size();
	    	int[] ns = new int[(capacity/2)];
	    	capacity=capacity/2;
	   		System.arraycopy(s, 0, ns, 0, length);
	   		s=ns;
			
			
		}


		void display(){
	        if (top < 0)
	            System.out.println(" stack is empty");
	        else {
	            System.out.println(" content of stack is: ");

	            for (int i = 0; i <= top; i++) 
	                System.out.print(s[i] + "\t");
	        	}
	    }
	        
	    int size() {
	    	return top+1 ;
	    }
	        

	    



	}



