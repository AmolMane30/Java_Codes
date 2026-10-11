// Row = 4
// Col = 4

/*
    1  1  1  1
    2  2  2  2
    3  3  3  3
    4  4  4  4
*/


import java.util.*;

public class program120
{
    static void display(int Row, int Col)
    {
        for(int i = 1; i <= Row; i++)
        {
            for(int j = 1; j <= Col; j++)
            {
                System.out.print(i+"\t");
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