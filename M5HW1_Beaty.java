import java.util.Scanner;


/**
 * M5HW1_Beaty
 */
public class M5HW1_Beaty 
{

    public static void main(String[] args) 
    {
        String again = "y";
        while(again.equals("y"))
        {

            double average, gradeVal, totalGrade = 0;
            int amt, currentAmt = 1;
            char grade;
            Scanner scnr = new Scanner(System.in);

            System.out.println("How many grades will be entered for the student.");
            amt = scnr.nextInt();

            do
            {
                System.out.println("Enter grade #" + currentAmt);
                gradeVal = scnr.nextDouble();
                while(gradeVal >= 0 && gradeVal <= 100)
                {
                    totalGrade += gradeVal;
                    currentAmt += 1;
                    gradeVal = -1.000001;
                }
                while(gradeVal != -1.000001)
                {
                    System.out.println("INVALID INPUT");
                    gradeVal = -1.000001;
                } 
            }
            while(currentAmt <= amt);

            average = totalGrade / amt;
            System.out.println("The grade average is " + average + ".");

                if (average >= 90)
                    {
                        grade = 'A';
                    }
                else if (average >= 80)
                    {
                        grade = 'B';
                    }
                else if (average >= 70)
                    {
                        grade = 'C';
                    }
                else if (average >= 60)
                    {
                        grade = 'D';
                    }
                else
                    {
                        grade = 'F';
                    }
                
                System.out.println("Grade is " + grade);

                System.out.println("Enter 'y' to run the program again. Enter anything else to terminate the program");
                again = scnr.next();
                again = again.toLowerCase();
                scnr.close();
            }
        
    }
}