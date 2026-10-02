public class program51
{
    public static void main(String[] arg)
    {
        int no = 78945;

        while(no != 0)
        {
            int digit = no % 10;
            no = no / 10;

            System.out.print(digit);
        }
    }
}