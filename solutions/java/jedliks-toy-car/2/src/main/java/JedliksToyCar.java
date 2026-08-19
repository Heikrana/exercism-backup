public class JedliksToyCar {
    private int distanceDriven = 0;
    private int batteryPcent = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (this.batteryPcent == 0) {
            return "Battery empty";
        }

        return "Battery at " + this.batteryPcent + "%";
    }

    public void drive() {
        if (this.batteryPcent == 0) {
            return;
        }

        this.distanceDriven += 20;
        this.batteryPcent -= 1;
    }
}
