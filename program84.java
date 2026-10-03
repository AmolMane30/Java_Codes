
import java.util.Scanner;

public class program84
{
    public static int countOdd(int arr[], int length)
    {
        int count= 0;

        for(int i = 0; i < length; i++)
        {
            if(arr[i] % 2 != 0)
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
         
        int ans = countOdd(arr,length);
        System.out.println("Odd Count of elements is : "+ans);
       
        sc.close();
    }
}