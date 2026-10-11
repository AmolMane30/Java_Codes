// find the maximum elemnt 

import java.util.*;

public class program94
{
    class Maximum
    {
        public int maximum(int arr[], int len)
        {
            int max = arr[0];

            for(int i = 1; i < len; i++)
            {
                if(arr[i] > max)
                {
                    max = arr[i];
                }
            }
            return max;
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int n = 0, max = 0;

        System.out.println("Enter length : ");
        n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter array elements : ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        program94 pObj = new program94();
        Maximum sObj = pObj.new Maximum();

        max = sObj.maximum( arr,n);

        System.out.println("Maximum element is : "+max);
    }
}