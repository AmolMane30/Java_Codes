
import java.util.Scanner;

public class program83
{
    public static int countEven(int arr[], int length)
    {
        int count= 0;

        for(int i = 0; i < length; i++)
        {
            if(arr[i] % 2 == 0)
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
        System.out.println("Enter length : ");
        length = sc.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter array elements : ");
        for(int i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }
         
        int ans = countEven(arr,length);
        System.out.println("Even Count of elements is : "+ans);
       
        sc.close();
    }
}