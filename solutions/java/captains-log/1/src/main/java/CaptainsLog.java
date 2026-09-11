import java.util.Random;

class CaptainsLog {
    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int planetClassCount = this.PLANET_CLASSES.length;
        int randomPlanetIndex = this.random.nextInt(planetClassCount);

        return this.PLANET_CLASSES[randomPlanetIndex];
    }

    String randomShipRegistryNumber() {
        return String.format("NCC-%d", 1000 + this.random.nextInt(9000));
    }

    double randomStardate() {
        return 41000 + 1000 * this.random.nextDouble();
    }
}
