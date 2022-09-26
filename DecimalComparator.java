public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));

    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int n1 = (int) (num1 *1000);
        int n2 = (int) (num2 *1000);
        if(n1 == n2){
            return true;
        }
        return false;
    }
}
