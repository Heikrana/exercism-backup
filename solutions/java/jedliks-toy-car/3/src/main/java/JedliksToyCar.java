public class JedliksToyCar {
    private int distanceDriven = 0;
    private int batteryPcent = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distanceDriven);
    }

    public String batteryDisplay() {
        if (this.batteryPcent == 0) {
            return "Battery empty";
        }

        return String.format("Battery at %d%%", this.batteryPcent);
    }

    public void drive() {
        if (this.batteryPcent == 0) {
            return;
        }

        this.distanceDriven += 20;
        this.batteryPcent -= 1;
    }
}
