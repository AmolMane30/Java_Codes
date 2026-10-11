 // Input : 4
// Output : 4  3  2  1  1  2  3  4  

import java.util.*;

public class program105
{
    static void display(int n)
    {
        for(int i = n; i >= 1; i--)
        {
            System.out.print(i+"\t");
        }
        for(int i = 1; i <= n; i++)
        {
            System.out.print(i+"\t");
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