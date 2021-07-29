import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16 {

    public  static  void main(String[] args)
        throws IOException 
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
   String S = bufferedReader.readLine();
         
              try
            {
                Integer number=Integer.valueOf(S);                             System.out.println(number);

            }catch (Exception e)
            {
                    System.out.println("Bad String");
            }
            bufferedReader.close();
        }
    }

/* input : 0  ->>> 3 ,3134
   output: 0  ->>> 3 ,3134

   input : 1  ->>> za,abc
   output: 1  ->>> Bad String
*           */
