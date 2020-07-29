import java.util.Scanner;

public class Sparse {
    public static void main(String[] args)
        {
            Scanner s = new Scanner (System.in);
            int[][] a = new int[50][50];
            int i,j,m,n,count=0; int found=0;
            int[] row = new int[50];
            int[] col = new int[50];
            int[] val = new int[50];


            System.out.println("Enter m and n");
            m=s.nextInt();
            n=s.nextInt();

            //Struct st = new Struct();

            System.out.println("Enter" + (m*n) + " values ");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j] = s.nextInt();
                    row[count] = i;
                    col[count] = j;
                    val[count] = a[i][j];
                    count++;
                }
            }


            System.out.println("Entered matrix is:");
            for(i=0;i<m;i++)
            {
                for (j = 0; j < n; j++)
                {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.print("\n");
            }

            System.out.println("Enter key");
            int key = s.nextInt();
            for(i=0;i<count-1;i++) {

                if (val[i] != key) ;
                else {
                    System.out.println("Key found at pos:" + (i + 1));
                    found = 1;

                }
            }
            if (found==0) System.out.println("Key not found");


        }

    }


