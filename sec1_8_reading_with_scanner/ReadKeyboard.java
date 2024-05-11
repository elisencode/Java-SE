import java.lang.*;
import java.util.*;

/* Scanner class is available in 'util' package. */

public class ReadKeyboard
{

    public static void main(String arg[])
    {
    
        Scanner sc=new Scanner(System.in);

        // Method for reading an integer
        // int x=sc.nextInt();

        // Method for reading a float
        // float x=sc.nextFloat();

        // Read one word
        // String x=sc.next();

        // Read a complete line
        // String x=sc.nextLine();

        // System.out.println(x);

        // ---

        // Read two numbers from the keyboard and adding them and displaying

        // int x,y;
        // System.out.println("Enter 2 numbers");
        // x=sc.nextInt();
        // y=sc.nextInt();

        // int z=x+y;
        // System.out.println("Sum is "+z);

        // ---
        
        // 2 means binary number
        sc.useRadix(2);

        // Read integer
        int x=sc.nextInt();

        // Display in decimal form
        System.out.println(x);


    }

}


/* How to find out the methods of any particular class?
`javap`, that's a utility from Java.
E.g., `javap java.util.Scanner`
*/
