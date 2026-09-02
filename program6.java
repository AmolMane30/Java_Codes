// addition program
import java.util.Scanner;

class program6
{
    public static void main(String a[])
    {
        float f1 = 0.0f;
        float f2 = 0.0f;

        float fAns = 0.0f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no : ");
        f1 = sc.nextFloat();
        
        System.out.println("Enter second no : ");
        f2 = sc.nextFloat();

        fAns = f1 + f2;

        System.out.println("additon is : " + fAns);

    }
}