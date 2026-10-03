
import java.util.Scanner;

public class program82
{
    public static void evenDisplay(int arr[], int length)
    {
        int sum = 0;

        System.out.println("Even elements are : ");
        for(int i = 0; i < length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                System.out.println(arr[i]);
            } 
        }
        
    }

    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        int length = 0;
        System.out.println("Enter length : ");
        length = sc.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter array elements : ");
        for(int i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }
         
        evenDisplay(arr,length);

       
        sc.close();
    }
}