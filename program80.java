

/*
    Step 1 : Accept the number of elements form user 
    Step 2 : Allocate that memory dynamicallly
    Step 3 : Accept the values and store into the dynamic memory
    Step 4 : Perform the operations
    Step 5 : Deallocate that memory
*/

import java.util.Scanner;

public class program80
{
    public static int addition(int arr[], int length)
    {
        int sum = 0;

        for(int i = 0; i < length; i++)
        {
            sum = sum + arr[i];    
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

        int result = addition(arr,length);
        System.out.println("Addition is : "+result);

        sc.close();
    }
}