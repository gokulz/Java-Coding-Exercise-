public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
    public static boolean isPalindrome(int number){
        int n;
        int reverse =0;
        int t = number;
        while(number!=0) {
            n = number % 10;
            reverse = (reverse*10) + n;
            number = number / 10;
               }
        if(t==reverse){
            return true;
        }

        return false;
    }
}
