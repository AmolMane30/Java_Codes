// Input : 5
// Output : a  b  c  d  e

import java.util.*;

public class program125
{
    static void display(int val)
    {
        char ch = 'a';

        for(int i = 1; i <= val; i++)
        {
            System.out.print(ch+"\t");
            ch++;
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int val1 = 0;

        System.out.println("enter val1 : ");
        val1 = sc.nextInt();

        display(val1);
    }
}