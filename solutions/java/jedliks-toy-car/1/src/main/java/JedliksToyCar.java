public class JedliksToyCar {
    private int distanceDriven = 0;
    private int batteryPcent = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryPcent == 0) {
            return "Battery empty";
        }

        return "Battery at " + batteryPcent + "%";
    }

    public void drive() {
        if (batteryPcent == 0) {
            return;
        }

        distanceDriven += 20;
        batteryPcent -= 1;
    }
}
