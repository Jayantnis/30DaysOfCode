nimport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner scan=new Scanner(System.in);
        int ire= scan.nextInt();
        for(int j=0;j<ire;j++)
        {
            int in = scan.nextInt();
            for(int i=2; i<=in/i; i++)
            {
                if(in%i==0){in=1;}
            }
            if(in==1) System.out.println("Not prime");
            else System.out.println("Prime");
        }
    }


}



/**
 * 
 * 
 * 
 * Input
 *  (stdin)

Download
3
12
5
7
Your Output (stdout)
Not prime
Prime
Prime
Expected Output

Download
Not prime
Prime
Prime
 * */