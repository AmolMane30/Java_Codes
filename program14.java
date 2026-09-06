import java.util.*;

public class program13
{
    private class Percentage 
    {
        public float percentage(int obt, int total)
        {
            float percentage = ((float)obt / (float)total ) * 100;
            return percentage;
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int total_marks = 0;
        int obtained_marks = 0;

        System.out.println("enter total marks : ");
        total_marks = sc.nextInt();

        System.out.println("Enter obtained marks : ");
        obtained_marks = sc.nextInt();

        program13 progObj = new program13();
        Percentage pObj = progObj.new Percentage();

        float percentage = pObj.percentage( obtained_marks, total_marks);
        System.out.println("percentage obtained is :"+percentage);

        sc.close();

    }
}