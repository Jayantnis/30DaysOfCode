import java.util.*;

class Printer <T> {

    
 public static <E>  void printArray(E[] intArray) {
        for(E element :intArray)
        {
            System.out.println(element+" ");
        }
    }// its very easily

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here



}

public class Generics {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}
/****
 * 
 * Input (stdin)

Download
3
1
2
3
2
Hello
World
Your Output (stdout)
1 
2 
3 
Hello 
World 
Expected Output

Download
1
2
3
Hello
World

 * 
 * */