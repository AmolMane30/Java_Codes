// Addition of every element in array and present total sum
// Author : Amol R. Mane
// Date : 2.10.2k26


import java.util.Scanner;

public class program66
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        int[] Arr = new int[4];

        System.out.println("Enter values : ");        
        for(int i = 0; i < 4; i++)
        {
            Arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < 4; i++)
        {
            sum = sum + Arr[i];    
        }
        System.out.println("Sum of array elements is  : "+sum);

        sc.close();
    }
}