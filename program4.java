import java.util.*;

public class program4
{
    public static void main(String a[])
    {
        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No1 : ");
        iNo1 = sc.nextInt();
        
        System.out.print("Enter No2 : ");
        iNo2 = sc.nextInt();

        iAns = iNo1 + iNo2;

        System.out.println("Addition is : " + iAns);
    }
}