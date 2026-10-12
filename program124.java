// Row = 4
// Col = 4

/*
    0  2  3  4
    1  0  3  4
    1  2  0  4
    1  2  3  0
    
*/

import java.util.*;

public class program124
{
    static void display(int Row, int Col)
    {
        for(int i = 1; i <= Row; i++)
        {
            for(int j = 1; j <= Col; j++)
            {
                if(i == j)
                {
                    System.out.print("0\t");
                }
                else
                {
                    System.out.print(j+"\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int val1 = 0, val2 = 0;

        System.out.println("enter val1 : ");
        val1 = sc.nextInt();

        System.out.println("enter val2 : ");
        val2 = sc.nextInt();


        display(val1, val2);
    }
}