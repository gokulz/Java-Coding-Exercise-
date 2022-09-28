/*Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.

For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"

If the parameter kiloBytes is less than 0 then print the text "Invalid Value".

EXAMPLE INPUT/OUTPUT

printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"

printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.

printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"

TIP: Be extremely careful about spaces in the printed message. 

TIP: Use the remainder operator

TIP: 1 MB = 1024 KB */





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
