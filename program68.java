
import java.util.Scanner;

public class program68
{
    private class Display
    {
        public void display(int Arr[])
        {
            for(int i = 0; i < Arr.length; i++)
            {
                System.out.println("Values in array are : "+Arr[i]);
            }
        }
    }

    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        int[] Arr = new int[4];

        System.out.println("Enter values : ");        
        for(int i = 0; i < 4; i++)
        {
            Arr[i] = sc.nextInt();
        }

        program68 pObj = new program68();
        Display dObj = pObj.new Display();

        dObj.display(Arr);

        sc.close();
    }
}