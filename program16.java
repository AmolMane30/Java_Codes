import java.util.Scanner;

public class program16
{
    private class DisplayResult
    {
        public void displayResult(float perct)
        {
            if(perct >= 40.00f)
            {
                System.out.println("Pass");
            }
            else
            {
                 System.out.println("Fail");
            }
        }
    }

    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        float fPect = 0.0f;

        System.out.println("Enter percentage : ");
        fPect = sc.nextFloat();

        program16 pObj = new program16();
        DisplayResult dObj = pObj.new DisplayResult();

        dObj.displayResult(fPect);

    }
}