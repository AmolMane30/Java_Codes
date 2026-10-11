// Input : 5
// Output : 1  2  3  4  5

import java.util.*;

public class program103
{
    static void display(int n)
    {
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