package CircleAppPKG;

/**
 * Created by anthonyfortney on 11/30/16.
 *
 *  To find circumference: C=2piR
 *  To find area: A=PiR^2
 */

public class Circle {

    double radius = 0;
    int circleCount = 0;


    public Circle(double radius) {
        this.radius = radius;
    }


    public double getCircumference(){
        return 2 * (Math.PI * radius);


    }

    public String getFormattedCircumference(){
        String formatted_C_Output = String.format("%.2f");
        return formatted_C_Output;
    }

    public double getArea(){
        return Math.PI * (radius * radius);

    }

    public String getFormattedArea(){
        String formatted_A_Output = String.format("%.2f");
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
