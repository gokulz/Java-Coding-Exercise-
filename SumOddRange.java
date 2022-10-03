public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));

    }
    public static boolean isOdd(int number){
        if(number<0){
            return false;
        }
        if(number%2==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        int sum=0;
        //validation to check both start and end are greater than 1
        if(start<1 || end<1){
            return -1;
        }
        if(end<start)//start=20,end=5
        {
            return -1;
        }
        //range
        for(int i= start; i<=end;i++) {
            // checking whether the number is odd or not
            if (isOdd(i)) {
                sum = sum + i;
            }
        }
        return sum;

    }
}
