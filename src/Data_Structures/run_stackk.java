package Data_Structures;

import java.util.Scanner;

public class run_stackk {
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        Stackkk s = new Stackkk();
        Scanner sc = new Scanner(System.in);
        int a, item;

        for (; ; ) {
            System.out.println("Enter 1:Push 2:Pop 3:Display 4:Size  or anything else to exit");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("enter item");
                    item = sc.nextInt();
                    s.push(item); // top, s.s);
                    break;

                case 2:
                    s.pop(); // s.s);
                    break;

                case 3:
                    s.display(); // s.s);
                    break;

                case 4:
                    System.out.println(s.size());
                    break;

                default:
                    return;
            }
        }
    }

}


