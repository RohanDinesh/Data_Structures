package Stack;//import java.util.Scanner;

public class Stackkk {
    public static int[] s = new int[5];
    public static int top = -1;

    void push(int item) {
        if (top == 4)
            System.out.println(" stack is full");

        else {
            top++;
            s[top] = item;
        }
    }

    void pop() {
        if (top < 0)
            System.out.println(" stack is empty");
        else {
            System.out.println("item deleted is" + s[top]);
            top--;
        }

    }

    void display(){
        if (top < 0)
            System.out.println(" stack is empty");
        else {
            System.out.println(" content of stack is: ");

            for (int i = 0; i <= top; i++)
                System.out.print(s[i] + "\t");

            System.out.println();
        }
    }

    int size() {
        return top+1 ;
    }






}


