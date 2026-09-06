
import java.util.*;


public class program36
{
    private class Display
    {
        private void display(int freq)
        {
            int count = 0;

            count = 1;

            while(count <= freq)
            {
                System.out.println("Jay Ganesh...");
                count++;
            }
        }
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int freq= 0;

        System.out.println("enter freq : ");
        freq = sc.nextInt();

        program36 pObj = new program36();
        Display dObj = pObj.new Display();

        dObj.display(freq);
    }
}