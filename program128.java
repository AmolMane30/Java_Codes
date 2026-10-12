// Input : 5
// Output : A  B  C  D  E

import java.util.*;

public class program128
{
    static void display(int val)
    {
        int i = 0;
        char ch = 97;

        for(i = 1, ch = 'A'; i <= val; i++, ch++)
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