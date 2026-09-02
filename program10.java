import java.util.*;

class Addition
{
    public double add(double no1, double no2)
    {
        if(no1 < 0)
        {
            no1 = -no1;
        }
        if(no2 < 0)
        {
            no2 = -no2;
        }
        
        double result = no1 + no2;

        return result;
    }
}

class program10
{
    public static void main(String a[])
    {
        double dNo1 = 0.0;
        double dNo2 = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no : ");
        dNo1 = sc.nextDouble();

        System.out.println("Enter second no : ");
        dNo2 = sc.nextDouble();

        double dAns = 0.0;

        Addition aobj = new Addition();

        dAns = aobj.add(dNo1, dNo2);

        System.out.println("Additon of double two no is : "+ dAns);

    }
}