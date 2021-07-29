import java.io.*;
import java.util.*;

public class Solution {
    static  void PrintF(int d1,int m1,int y1,int d2,int m2,int y2)
    { int fine=0;

        if((m2==m1 )&& (y2==y1))
        {
            System.out.println(15*(d1-d2));
        }else if((y1==y2)&&(m1>m2))
        {

            System.out.println(500*(m1-m2));
        }else if((d1<d2)&&(m1<m2)&&(y1>y2))
        {
                System.out.println(10000);
        }else if((d1>d2)&&(m1>m2)&&(y1>y2))
        {
            System.out.println(10000);
        } else{
            System.out.println(fine);
        }


    }



    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);

        int m2,m1,y2,y1,d2,d1;

        d1=n.nextInt();
        m1=n.nextInt();
        y1=n.nextInt();
        d2=n.nextInt();
        m2=n.nextInt();
        y2=n.nextInt();

         PrintF(d1, m1, y1,d2, m2, y2);


    }
}
/***
 * 
 * 
 * Compiler Message
Success
Input (stdin)

Download
31 8 2004
20 1 2004
Expected Output

Download
3500
 * 
 * 
 * */