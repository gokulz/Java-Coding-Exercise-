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
