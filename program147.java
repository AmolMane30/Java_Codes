
import java.util.*;

public class program147
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = new char[30];
        System.out.println("Enter char array");

        arr = sc.next().toCharArray();

        System.out.println("Your name is : "+new String(arr));
    }
}