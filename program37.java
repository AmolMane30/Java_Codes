
import java.util.*;


public class program37
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

        program37 pObj = new program37();
        Display dObj = pObj.new Display();

        dObj.display(freq);
    }
}