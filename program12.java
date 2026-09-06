// area of circle

import java.util.*;


public class program12
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        float radius = 0.0f;

        System.out.println("enter radius : ");
        radius = sc.nextFloat();

        AM aobj = new AM();
        float fans = aobj.helper(radius);

        // CalculatorArea cobj = new CalculatorArea();
        // float fAns = cobj.calculateArea(radius);

        System.out.println("area is : "+fans);
    }
}

class AM
{
    public float helper(float f1)
    {
        float fret = f1 * f1 * 3.14f;
        return fret;
    }
}