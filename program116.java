// Row = 4
// Col = 3

/*
    *  *  *
    *  *  *
    *  *  *  
    *  *  *
*/

import java.util.*;

public class program116
{
    static void display()
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void main(String arg[])
    {
        display();
    }
}