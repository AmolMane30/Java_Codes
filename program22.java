
import java.util.*;

public class program22
{
    private class Display
    {
        public void displayTimeTable(int std)
        {
            switch(std)
            {
                case 8:
                    System.out.println("time is 8.30");
                    break;

                case 9:
                    System.out.println("time is 9.30");
                    break;

                case 10:
                    System.out.println("time is 10.30");
                    break;
            }
            
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int std = 0;

        System.out.println("enter standared : ");
        std = sc.nextInt();

        program22 pObj = new program22();
        Display dObj = pObj.new Display();

        dObj.displayTimeTable(std);

    }
}