/**
 * Created by anthonyfortney on 11/30/16.
 *
 *  To find circumference: C=2piR
 *  To find area: A=PiR^2
 */

public class Circle {

    double radius = 0;
    double circumference = 0;
    double area = 0;


    public Circle(double radius) {
        this.radius = radius;
    }


    public double getCircumference(){
        this.circumference = 2 * (Math.PI * radius);
        return circumference;

    }

    public String getFormattedCircumference(){
        String formatted_C_Output = String.format("%.2f", circumference);
        return formatted_C_Output;
    }

    public double getArea(){
        this.area = Math.PI * (radius * radius);
        return area;
    }

    public String getFormattedArea(){
        String formatted_A_Output = String.format("%.2f", area);
        return formatted_A_Output;
    }

//    private String formatNumber(double x){
//
//    }
//
//    public static int getObjectCount(){
//
//    }

}
