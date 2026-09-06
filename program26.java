public class program26
{
    private class Display
    {
        private void display()
        {
            int count = 0;

            for(count = 0; count <= 4; count++)
            {
                System.out.println("Jay Ganesh...");
            }
        }

    }

    public static void main(String[] arg)
    {
        program26 pObj = new program26();
        Display dObj = pObj.new Display();

        dObj.display();
    }
}