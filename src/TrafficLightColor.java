/**
 * Created by anthonyfortney on 11/18/16.
 */
public enum TrafficLightColor {
    RED, YELLOW, GREEN;


    public static void main(String[] args) {
        TrafficLightColor color = TrafficLightColor.GREEN;
        makeDrivingDecision(color);
    }


    public static void makeDrivingDecision(TrafficLightColor color) {
        switch (color) {
            case GREEN:
                System.out.println("Proceed through the intersection.");
                break;
            case YELLOW:
                System.out.println("Slow down, the light is about to turn red!");
                break;
            case RED:
                System.out.println("Stop at the intersection!");
        }

    }
}

