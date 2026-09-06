
import java.util.*;

public class program21
{
    private class Display
    {
        public void displayTimeTable(int std)
        {
            switch(std)
            {
                case 8:
                    System.out.println("time is 8.30");

                case 9:
                    System.out.println("time is 9.30");

                case 10:
                    System.out.println("time is 10.30");
                
            }
            
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int std = 0;

        System.out.println("enter standared : ");
        std = sc.nextInt();

        program21 pObj = new program21();
        Display dObj = pObj.new Display();

        dObj.displayTimeTable(std);

    }
}