public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesSpentInOven) {
        if (minutesSpentInOven > expectedMinutesInOven() || minutesSpentInOven < 0) {
            return 0;
        }

        return expectedMinutesInOven() - minutesSpentInOven;
    }

    public int preparationTimeInMinutes(int layerCount) {
        if (layerCount <= 0) {
            return 0;
        }

        return layerCount * 2;
    }

    public int totalTimeInMinutes(int layersAddedCount, int minutesSpentInOven) {
        return preparationTimeInMinutes(layersAddedCount) + minutesSpentInOven;
    }

    public void main() {}
}
