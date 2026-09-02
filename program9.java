import java.util.*;

class Addition
{
    public float additionn(float f1, float f2)
    {
        float fans = 0.0f;
        fans = f1 + f2;

        return fans;
    }
}

class program7
{
    // private class Addition
    // {
    //     private float addition(float fNo1, float fNo2)
    //     {
    //         float fAns = 0.0f;
    
    //         fAns = fNo1 + fNo2;
    //         return fAns;
    //     }
    // }

    // float addition(float fNo1, float fNo2)
    // {
    //     float fAns = 0.0f;
    //     fAns = fNo1 + fNo2;
    //     return fAns;
    // }
    public static void main(String a[])
    {
        float f1 = 0.0f;
        float f2 = 0.0f;

        float fAns = 0.0f;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first num : ");
        f1 = sc.nextFloat();

        System.out.print("enter second num : ");
        f2 = sc.nextFloat();

        Addition aobj = new Addition();

        fAns = aobj.additionn(f1, f2);

        System.out.println("addtion is : " + fAns);


    }
}