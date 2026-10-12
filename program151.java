
import java.util.*;

public class program151
{
    public static void display(char arr[])
    {
        int i = 0;
        while(i < arr.length)
        {
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = new char[30];
        System.out.println("Enter char array");

        arr = sc.nextLine().toCharArray();

        display(arr);
        
    }
}