public class IntEqualityPrinter {
    public static void main(String[] args) {
        PrintEqual(1,1,1);

    }
    public static void PrintEqual(int a, int b, int c){
        //condition checking
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
        }
        else if(a==b && b==c && c==a){
            System.out.println("All the numbers are equal ");
        } else if(a!=b && b!=c && c!=a) {
            System.out.println("All are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}
