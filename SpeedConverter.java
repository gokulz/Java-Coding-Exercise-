public class SpeedConverter {
    public static void main(String[] args) {
       long miles = toMilesPerHour(10.5);
        System.out.println(miles);
        printConversion(10.5);
    }

    public static long toMilesPerHour(double KilometersPerHour) {
        if (KilometersPerHour < 0) {
            return -1;
        }
        return Math.round(KilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h"
                    + " = " + milesPerHour + " mi/h");
        }
    }
}