// Row = 4
// Col = 3

/*
    *  *  *
    *  *  *
    *  *  *  
    *  *  *
*/

import java.util.*;

public class program118
{
    static void display(int Row, int Col)
    {
        for(int i = 0; i < Row; i++)
        {
            for(int j = 0; j < Col; j++)
            {
                System.out.print("#\t");
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