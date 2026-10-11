// Input : 5
// Output : 2  4  6  8  10


import java.util.*;

public class program113
{
    static void display(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            System.out.print(i*2+"\t");
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