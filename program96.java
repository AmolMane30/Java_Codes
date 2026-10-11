// ReverseDisplay of elements 

import java.util.*;

public class program96
{
    class Reverse
    {
        public void reverse(int arr[], int len)
        {
            int rev = 0;

            System.out.println("Reverse display of elements is : ");
            for(int i = len-1; i >= 0; i--)
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.println("Enter length : ");
        n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter array elements : ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        program96 pObj = new program96();
        Reverse rObj = pObj.new Reverse();

        rObj.reverse(arr,n);

    }
}