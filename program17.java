import java.util.*;

public class program17
{
    private class DisplayPerct
    {
        public void displayPerct(float fPerct_Value)
        {
            if(fPerct_Value > 100.00f)
            {
                System.out.println("Invaild input");
            }
            else if(fPerct_Value >= 40.00f)
            {
                System.out.println("Pass");
            }
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        float fPerct = 0.0f;
        System.out.println("Enter percentage : ");
        fPerct = sc.nextFloat();

        program17 pObj = new program17();
        DisplayPerct dObj = pObj.new DisplayPerct();

        dObj.displayPerct(fPerct);

    }
}