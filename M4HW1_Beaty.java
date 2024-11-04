import java.util.Scanner;

/**
 * M4HW1_Beaty
 * Tristan Beaty
 * 10-1-2024
 */
public class M4HW1_Beaty 
{

    public static void main(String[] args) 
    {
        final double WIDGETPRICE = 4.79;
        final int SALARY = 2000;
        String name, rerun;
        int totalWidgetsSold = 0, totalReturnWidgets = 0, month = 1;
        int widgetsSold, totalWidgets = 0;
        int returnWidgets, totalReturns = 0;
        int netWidgetsSold;
        double widgetSalesAmount;
        double commissionRate = 0;
        double commissionAmmount;
        double monthlySalary, totalSalary = 0;

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scnr.nextLine();
        System.out.println("");

        do
        {
            System.out.println("Month #" + month);
            for(int i = 1; i <= 4; i = i + 1)
            {
            System.out.print("How many widgets did you sell in week #" + i + ": " );
            widgetsSold = scnr.nextInt();
            totalWidgetsSold += widgetsSold;
            }
            for(int i = 1; i <= 4; i = i + 1)
            {
            System.out.print("How many widgets were returned from week #" + i + ": ");
            returnWidgets = scnr.nextInt();
            totalReturnWidgets += returnWidgets;
            }

            netWidgetsSold = totalWidgetsSold - totalReturnWidgets;
            widgetSalesAmount = netWidgetsSold * WIDGETPRICE;

        
            if ((netWidgetsSold >= 0) && (netWidgetsSold <= 100))
            {
                commissionRate = .1;
            }
            else if ((netWidgetsSold >= 101) && (netWidgetsSold <= 199))
            {
                commissionRate = .15;
            }
            else if ((netWidgetsSold >= 200) && (netWidgetsSold <= 299))
            {
                commissionRate = .2;
            }
            else if (netWidgetsSold >= 300)
            {
                commissionRate = .25;
            }

            commissionAmmount = widgetSalesAmount * commissionRate;
            monthlySalary = commissionAmmount + SALARY;
            totalSalary += monthlySalary;
            totalWidgets += totalWidgetsSold;
            totalReturns += totalReturnWidgets;

            System.out.println("");
            System.out.println("");
            System.out.println("Sales Person: " + name);
            System.out.println("Month #" + month);
            System.out.println("Widgets Sold: " + totalWidgetsSold);
            System.out.println("Widgets Returned: " + totalReturnWidgets);
            System.out.println("Net Widgets Sold: " + netWidgetsSold);
            System.out.printf("Widget Sales Ammount: $%.2f.%n", widgetSalesAmount);
            System.out.printf("Commission Ammount: $%.2f.%n", commissionAmmount);
            System.out.println("");
            System.out.printf("Monthly Salary: $%.2f.%n", monthlySalary);
            System.out.println("");
            System.out.println("Would you like to run the program again? Enter 'y' to run again, 't' to see your total salary, or press 'n' to quit.");
            rerun = scnr.next();
            rerun = rerun.toLowerCase();
            System.out.println("");

            if (rerun.equals("t")) 
            {
                System.out.printf("Your total salary so far is: $%.2f.%n", totalSalary);
                System.out.println("Total Widgets Sold: " + totalWidgets);
                System.out.println("Total Widgets Returned: " + totalReturns);
                System.out.println("Would you like to run the program again? Enter 'y' to run again or enter 'n' to quit.");
                rerun = scnr.next();
                rerun = rerun.toLowerCase();
            }
            month += 1;
            totalWidgetsSold = 0;
            totalReturnWidgets = 0;

        }
        while(rerun.equals("y"));

        System.out.println("Terminating....");
        System.out.println("Program Closed, Have a good day " + name + ".");


        scnr.close();
    }
}