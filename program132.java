// Input : Row = 4   Col = 4
// Output : a  a  a  a
//          b  b  b  b
//          c  c  c  c
//          d  d  d  d

import java.util.*;

public class program132
{
    static void display(int Row, int Col)
    {
        char ch = 'a';

        for(int i = 1; i <= Row; i++, ch++)
        {
            for(int j = 1; j <= Col; j++)
            {
                System.out.print(ch+"\t");
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
        sc.close();
    }
}