//////////////////////////////////////
///  Find area of circle
/// 
/// ////////////////////////////////

import java.util.Scanner;

 class businessLogic
{
        public float areafun(float radius)
        {
            float fAreaResult = 0.0f;

            fAreaResult = 3.14f * radius * radius;
            return fAreaResult;
        }
}

public class program11
{
    public static void main(String a[])
    {
        float fRadius = 0.0f;
        float fArea = 0.0f;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius : ");
        fRadius = sc.nextFloat();

        businessLogic bobj = new businessLogic();
        fArea = bobj.areafun(fRadius);

        System.out.println("Area of Circle is : "+fArea);

    }
}