/*Minutes To Years and Days Calculator
Write a method printYearsAndDays with parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".

Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.

EXAMPLES OF INPUT/OUTPUT:

printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"

printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"

printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"

TIPS:
Use the remainder operator
1 hour = 60 minutes
1 day = 24 hours
1 year = 365 days */


public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        PrintYearsAndDays(525600); //calling method

    }
    public static void PrintYearsAndDays(long minutes){
        //validation
        if(minutes<0){
            System.out.println("Invalid Value ");
        }
        else{
            long hours,days,years,remainingDays;
             hours = minutes /60;
             days = hours/24;
             years = days /365;
             remainingDays = days % 365; //calculating remainingDays
            System.out.println(minutes + " min" + " = " +years + " y" +" and " + remainingDays + " d");

        }
    }
}
