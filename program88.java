
import java.util.Scanner;

public class program88
{
    public static int frequency(int arr[], int length)
    {
        int count = 0;
        for(int i = 0; i < length; i++)
        {
            if(arr[i] == 10)
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
         
        int ans = frequency(arr, length);
        System.out.println("Fre of 10 is : "+ans);
        
       
        sc.close();
    }
}