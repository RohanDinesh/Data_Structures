import java.util.Scanner;

public class runqueue {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        queue qu = new queue();
        Scanner s = new Scanner(System.in);
        int a;


        for (; ; ) {
            System.out.println("Enter 1:add 2:delete 3:display");
            a = s.nextInt();
            
            
            switch (a) {
                case 1:
                	 System.out.println("Enter item");
                     int item = s.nextInt();
                     qu.add(item);
                     break;

                case 2:
                    qu.delete();
                    break;

                case 3:
                    qu.display();
                    break;

                default:
                    return;
            }
        }
    }
}
