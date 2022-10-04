public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("The Sum of the digits is " +sumOfDigits(125) );

    }
    public static int sumOfDigits(int number){
        int sum =0;
        int n;
        if((number <10)){
            return -1;
        }
        while(number>0){
            //extract least significant
            n = number%10;

            sum=sum+n;

            //discard the least significant
            number= number/10;
        }
        return sum;
    }
}
