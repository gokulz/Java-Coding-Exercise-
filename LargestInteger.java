import java.util.Scanner;

public class LargestInteger {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the number & please enter 0 to stop");
       int t = Integer.MIN_VALUE;//t values has min -2147483648
        int n;
        while (true) {
            n = c.nextInt(); //getting user input until users enters 0;
            if (n == 0) {
                break;
            }
            //validation checking
            if(t<n){
              t=n;
            }
        }
        System.out.println(t);

    }
}