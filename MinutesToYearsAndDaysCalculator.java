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
