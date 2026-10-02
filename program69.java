
import java.util.Scanner;

public class program69
{
    private class Display
    {
        public void display(int Arr[], int size)
        {
            for(int i = 0; i < size; i++)
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

        program69 pObj = new program69();
        Display dObj = pObj.new Display();

        dObj.display(Arr, 4);

        sc.close();
    }
}