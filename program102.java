// Input : 5
// Output : *  
//          *
//          *
//          *
//          *

import java.util.*;

public class program102
{
    static void display(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            System.out.print("*\n");
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