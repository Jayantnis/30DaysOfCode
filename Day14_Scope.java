import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here



//sold line end no touch above and let's do coding

     // Add your code here
     int i,x,y,z=0,l;//reference //global declaration loop iterations
int n;//error control STEP CONTROL DIMES ERROR
    public Difference(int[] a)
    {
        elements =new int[100];//cored line stage's
       try {
           for (i = 0; i < a.length; i++)//set dime.
           {
               for (x = 0; x < a.length; x++)//calculation controller
               {
                   z = a[x];
                   elements[x] = a[i] - z;
               //  System.out.print(" " + a[i] + "-" + z + "=" + " '" + elements[x] + "' ");

                   if (maximumDifference < elements[x])//trigger maximum difference find logic
                   {
                       maximumDifference = elements[x];
                   }
               }
           }
       }catch (Exception e)
       {

       }
    }

    public void computeDifference()
    {
       // System.out.println(" "+y);//Result
    }


} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
/***
 * 
 * 
 * Input (stdin)

Download
3
1 2 5
Your Output (stdout)
4
Expected Output

Download
4
**/