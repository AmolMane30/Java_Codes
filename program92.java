import java.util.*;

public class program92
{
    class Average
    {
        float average(int len, float arr[])
        {
            float sum = 0.0f;
            for(int i  = 0; i < len; i++)
            {
               sum = sum + arr[i];
            }
            return (sum/len);
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        float bRet = 0.0f;

        System.out.println("Enter length : ");
        n = sc.nextInt();

        float[] arr = new float[n];
        
        System.out.println("Enter array elements : ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextFloat();
        }

        program92 pObj = new program92();
        Average sObj = pObj.new Average();

        bRet = sObj.average(n, arr);

        System.out.println("Average is : "+bRet);
    }
}