import java.util.*;

public class program91
{
    class Search
    {
        boolean search(int value, int len, int arr[])
        {
            boolean bRet = false;
            for(int i  = 0; i < len; i++)
            {
                if(arr[i] == value)
                {
                    bRet = true;
                    break;
                }
            }
            return bRet;
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

        int value = 0;
        System.out.println("Enter number that you  want to search :");
        value = sc.nextInt();

        boolean bRet = false;

        program91 pObj = new program91();
        Search sObj = pObj.new Search();

        bRet = sObj.search(value, n, arr);

        if(bRet)
        {
            System.out.println("Element found ");
        }
        else
        {
            System.out.println("Not found ");
        }


    }
}