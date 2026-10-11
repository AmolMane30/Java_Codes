

import java.util.*;

public class program99
{
    static void display(int n)
    {
        for(int i = n; i >= 1; i--)
        {
            System.out.print(i+" ");
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int value = 0;
        System.out.println("Enter len : ");
        value = sc.nextInt();

        display(value);


    }
}