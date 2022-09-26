public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(4.0,5.0));

    }
    public static double area(double radius){
      //  double PI=3.14;
        if(radius<0){
            return -1.0;
        }
        return radius*radius*Math.PI;
    }
    public static double area(double x,double y){
        if((x<0)||(y<0)){
            return -1.0;
        }
        return x*y;
    }
}
