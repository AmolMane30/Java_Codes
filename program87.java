
import java.util.Scanner;

public class program87
{
    public static void additionOddEven(int arr[], int length)
    {
        int sumE = 0, sumO = 0;

        for(int i = 0; i < length; i++)
        {
            if(arr[i] % 2 != 0)
            {
                sumO = sumO + arr[i];    
            } 
            if(arr[i] % 2 == 0)
            {
                sumE = sumE + arr[i];
            }
        }
        System.out.println("Even sum is : "+sumE);
        System.out.println("Odd sum is : "+sumO);
        
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
         
        additionOddEven(arr,length);
        
       
        sc.close();
    }
}