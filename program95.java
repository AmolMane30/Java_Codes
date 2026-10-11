// find the minimum elemnt 

import java.util.*;

public class program95
{
    class Minimum
    {
        public int minimum(int arr[], int len)
        {
            int min = arr[0];

            for(int i = 1; i < len; i++)
            {
                if(arr[i] < min)
                {
                    min = arr[i];
                }
            }
            return min;
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int n = 0, min = 0;

        System.out.println("Enter length : ");
        n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter array elements : ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        program95 pObj = new program95();
        Minimum mObj = pObj.new Minimum();

        min = mObj.minimum( arr,n);

        System.out.println("Minimum element is : "+min);
    }
}