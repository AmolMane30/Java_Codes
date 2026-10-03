
import java.util.Scanner;

public class program85
{
    public static int additionEven(int arr[], int length)
    {
        int sum = 0;

        for(int i = 0; i < length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                sum = sum + arr[i];    
            } 
        }
        return sum;
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
         
        int ans = additionEven(arr,length);
        System.out.println("addition of even elements is : "+ans);
       
        sc.close();
    }
}