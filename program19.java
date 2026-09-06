
import java.util.*;

public class program19
{
    private class Display
    {
        public void displayTimeTable(int std)
        {
            if(std == 8)
            {
                System.out.println("time is 9.30");
            }
            else if(std == 9)
            {
                System.out.println("time is 10.30");

            }
            else if(std == 10)
            {
                System.out.println("time is 11.30");
            }
            else
            {
                System.out.println("invalid input ");

            }
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int std = 0;

        System.out.println("enter standared : ");
        std = sc.nextInt();

        program19 pObj = new program19();
        Display dObj = pObj.new Display();

        dObj.displayTimeTable(std);

    }
}