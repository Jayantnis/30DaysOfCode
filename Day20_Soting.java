import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



import java.util.Scanner;

public class Day20_Sorting {

    public static void main(String[]args) {
        int j, i, numberOfSwaps = 0, temp = 0, sum = 0, input;
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int a[] = new int[n];


        for (i = 0; i < n; i++) {
            a[i] = x.nextInt();
        }//n number of input

        for (i = 0; i < n - 1; i++)
        {

            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {   // swap arr[j+1] and arr[j]
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    sum = sum + numberOfSwaps;
                    sum++;
                }

            }

        }


        for (numberOfSwaps = 0; numberOfSwaps <= n; numberOfSwaps++) {
            System.out.println("Array is sorted in "+sum +" swaps."+ "\nFirst Element: " + a[0] + "\nLast Element: " + a[n - 1]);
            break;
        }


    }

}
/*
* a[] = [ 4,3,1,2]
* Array is sorted in 5 swaps.
First Element: 1
Last Element:4
*
*
*   3
    1 2 3
*
 Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
*
*
*   3
    3 2 1
Array is sorted in 3 swaps.
First Element: 1
Last Element: 3


Input (stdin)

Download
3
1 2 3
Your Output (stdout)
Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
Expected Output

Download
Array is sorted in 0 swaps.
First Element: 1
Last Element: 3

* */
