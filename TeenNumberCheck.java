/*Teen Number Checker
We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

1.Write a method named hasTeen with 3 parameters of type int.

The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

EXAMPLES OF INPUT/OUTPUT:

hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19

hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19

hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19

2.Write another method named isTeen with 1 parameter of type int.

The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

EXAMPLES OF INPUT/OUTPUT:

isTeen(9);  should return false since 9 is in not range 13 - 19

isTeen(13);  should return true since 13 is in range 13 - 19
*/





public class TeenNumberCheck {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,19,99));
        System.out.println(isTeen(9));

    }
    public static boolean hasTeen(int num1,int num2,int num3){
        if(num1>=13&&num1<=19){
            return true;
        }
        else if(num2>=13 && num2<=19){
            return true;
        }
        else if(num3>=13 && num3 <=19){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isTeen(int num4){
        if(num4>=13 && num4<=19){
            return true;
        }
        else {
            return false;
        }
    }
}
