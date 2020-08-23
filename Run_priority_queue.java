package priority_queue;

import java.util.Scanner;

public class Run_priority_queue {

	public static void main(String[] args) {
		Priority_queue pq = new Priority_queue();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        int a;
        
        for (; ; ) {
            System.out.println("Enter 1:add 2:delete 3:display 4:isempty 5:isfull");
            a = s.nextInt();
            
            
            switch (a) {
                case 1:
                	 System.out.println("Enter item");
                     int item = s.nextInt();
                     pq.insert(item);
                     break;

                case 2:
                    pq.delete();
                    break;

                case 3:
                    pq.display();
                    break;
                    
                case 4: System.out.println(pq.isempty());
                	break;
                	
                case 5: System.out.println(pq.isfull());
            	break;

                default:
                    return;
            }
		

	}

}
}
