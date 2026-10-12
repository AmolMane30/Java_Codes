
import java.util.*;

public class program150
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = new char[30];
        System.out.println("Enter char array");

        arr = sc.nextLine().toCharArray();

        int i = 0;
       while(i < arr.length)
       {
            System.out.println(arr[i]);
            i++;
       }
        
    }
}