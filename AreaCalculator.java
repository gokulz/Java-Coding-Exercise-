/* #Method_Overloading
In Java, two or more methods may have the same name if they differ in parameters 
(different number of parameters, different types of parameters, or both).

#Area Calculator

1.Write a method named area with one double parameter named radius.

The method needs to return a double value that represents the area of a circle.

If the parameter radius is negative then return -1.0 to represent an invalid value.

2.Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.

The method needs to return an area of a rectangle.

If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

For formulas and PI value please check the tips below.

Examples of input/output:

area(5.0); should return 78.53975

area(-1);  should return -1 since the parameter is negative

area(5.0, 4.0); should return 20.0 (5 * 4 = 20)

area(-1.0, 4.0);  should return -1 since first the parameter is negative

TIP: The formula for calculating the area of a rectangle is x * y.

TIP: The formula for calculating a circle area is radius * radius * PI.

TIP: For PI use a constant from Math class e.g. Math.PI
*/






public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(4.0,5.0));

    }
    public static double area(double radius){
      //   PI=3.14;
        if(radius<0){
            return -1.0;
        }
        return radius*radius*Math.PI;
    }
    //method_overloading
    public static double area(double x,double y){
        if((x<0)||(y<0)){
            return -1.0;
        }
        return x*y;
    }
}
