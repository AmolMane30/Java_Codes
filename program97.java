// Input : 5
// * * * * *

import java.util.*;

public class program97
{
    static void star(int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print("* ");
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int value = 0;
        System.out.println("Enter len : ");
        value = sc.nextInt();

        star(value);


    }
}