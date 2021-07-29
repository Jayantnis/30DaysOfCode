

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
   
      Student(String firstName, String lastName, int identification , int [] scores)
        {
        super(firstName,lastName,identification );
        this.testScores=scores;
    }

    public String calculate()
    {
        int sum =0;
        for(int i : this.testScores)
            {
            sum+=i;
        }
        double avg= sum/testScores.length;
        if (avg<=100 && avg>=90)
            {
            return "O";
        }else if(avg<90 && avg>=80)
            {
             return "E";
        }
        else if(avg<80 && avg>=70)
            {
             return "A";
        }
        else if(avg<70 && avg>=55)
            {
             return "P";
        }
         else if(avg<55 && avg>=40)
            {
             return "D";
        }
        else{
             return "T";
        }
    }
    /*char calculate()
    {   int avg=0;
        for(int i=0;i<testScores.length;i++)
            avg+=testScores[i];
         avg=avg/testScores.length;
        return(avg> 89 ?'O':avg>79?'E':avg >69?'A':avg>54?'P':avg > 39 ?'D' : 'T' );
    }*/
}

/***
 * 
 * 
 * Compiler Message
Success
Input (stdin)

Download
Heraldo Memelli 8135627
2
100 80
Expected Output

Download
Name: Memelli, Heraldo
ID: 8135627
Grade: O**/