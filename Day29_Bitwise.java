

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;


public class Solution
{
    public static void main(String[] args)  {
     Scanner t=new Scanner(System.in);
        int i,j,l;
        int R=t.nextInt();
         for(l=0;l<R;l++)
        {   int N=t.nextInt();
            int K=t.nextInt();     
              int max=0; 
              for ( j =1; j <N; j++)  
                {for (i =j+1/*include by get function by j values*/; i <= N; i++) { int v=(j&i); if(v<K && v>max){  max=v;} }} System.out.println(max);}
    }
}
/***
 * 
 * 
 * Input (stdin)

Download
3
5 2
8 5
2 2
Your Output (stdout)
1
4
0
Expected Output

Download
1
4
0
 * **/