package Stack;
import java.util.Scanner;

public class Sparse_Matrix {

    /*public static class Sparse
    {
        public int row, col, val;
    }
    */

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        //Sparse se = new Sparse();
        int[][] a = new int[4][4];
        int zeros = 0;

        System.out.println("Enter Dimensions of Matrix");
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println("Enter array values");
        for(int i=0;i<m;i++)
        {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();

                if(a[i][j]==0)
                {
                    zeros++;
                }
            }
        }

        System.out.println ("Entered Array is:  \n");
        for(int i=0;i<m;i++)
        {
            for (int j = 0; j < n; j++) {
                System.out.print (a[i][j]  +" ");
            }
            System.out.print("\n");
        }

        if(zeros > (m*n)/2)
            System.out.println ("it is a sparse matrix");
        else
            System.out.println ("it is not a sparse matrix");

    }
}
