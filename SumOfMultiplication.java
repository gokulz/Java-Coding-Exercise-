/*Sum of all numbers that can be divided by both 3 and 5.
after breaking out the loop print the sum */







public class SumOfMultiplication {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        //using range from 1-1000
        for(int i=1; i<=1000; i++){
            //Numbers that can divided by both 3 and 5
            if(i%3==0 && i%5==0){
                count++;
                sum=sum+i;
               System.out.println(i);
               //using only five numbers for above condition
                if(count==5){
                    break;
                  }
            }
        }
        System.out.println(sum);
    }
}
