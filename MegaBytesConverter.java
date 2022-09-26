import java.util.Scanner;
public class MegaBytesConverter {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the kilobytes: ");
        int kiloBytes = n.nextInt();
        printMegaBytesAndKiloBytes(kiloBytes);


    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid value");
        }
        else {
            int kb = kiloBytes/1024;
            int kb2 = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB" + " = " + kb + " MB " + "and " + kb2 + " KB");
        }
    }
}
