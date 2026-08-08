public class CarsAssemble {
    int carsProducedPerHour = 221;

    public double productionRatePerHour(int speed) {
        double totalCars = speed * carsProducedPerHour;
        double workingCars = 0;

        if (speed <= 4) {
            workingCars = totalCars;
        } else if (speed <= 8) {
            workingCars = totalCars - (totalCars / 10);
        } else if (speed == 9) {
            workingCars = totalCars - (totalCars / 5);
        } else {
            workingCars = (77 * totalCars) / 100;
        }

        return workingCars;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
