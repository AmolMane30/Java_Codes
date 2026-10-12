// Input : 5
// Output : a  b  c  d  e

import java.util.*;

public class program126
{
    static void display(int val)
    {
        int i = 0;
        char ch = '\0';

        for(i = 1, ch = 'a'; i <= val; i++, ch++)
        {
            System.out.print(ch+"\t");
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int val1 = 0;

        System.out.println("enter val1 : ");
        val1 = sc.nextInt();

        display(val1);
        sc.close();
    }
}