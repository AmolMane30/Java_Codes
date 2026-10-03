
import java.util.Scanner;

public class program89
{
    public static int frequency(int arr[], int length, int val)
    {
        int count = 0;
        for(int i = 0; i < length; i++)
        {
            if(arr[i] == val)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        int length = 0;
        int val = 0;

        System.out.println("Enter length : ");
        length = sc.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter array elements : ");
        for(int i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }
         
        System.out.println("Enter the value that you want to search : ");
        val = sc.nextInt();

        int ans = frequency(arr, length, val);
        System.out.println("Fre of "+ val +" is : "+ans);
        
       
        sc.close();
    }
}