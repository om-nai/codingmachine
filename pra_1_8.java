import java.util.Scanner;

public class pra_1_8 {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String[] ans= { "D","B","D","C","C","D","A","E","A","D"};// answer key
        String[][] str = new String[8][10]; // runtime initialization

        System.out.println("Fill in the eight student's answers to 10 questions" );
        for (int i =0;i<str.length;i++) // here string length is 8
        {

            int count =0;
            for (int j=0;j<str[i].length;j++) // here string length is 10
            {
                str[i][j] = sc.next();
                if(str[i][j].equalsIgnoreCase(ans[j]))   // Ignor case of string
                    count++;  // counting right answer if it is true
            }
            System.out.println("Student's " + (i+1) + " correct answers are " + count);
        }
    }
}
