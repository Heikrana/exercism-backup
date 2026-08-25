
class BirdWatcher {
    private final int[] birdsPerDay;
    private static final int[] lastWeekCount = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return lastWeekCount;
    }

    public int getToday() {
        int arraySize = this.birdsPerDay.length;

        if (arraySize > 0) {
            return this.birdsPerDay[arraySize - 1];
        }

        return -1;
    }

    public void incrementTodaysCount() {
        int arraySize = this.birdsPerDay.length;

        if (arraySize == 0) {
            return;
        }

        this.birdsPerDay[arraySize - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdVisitCount : this.birdsPerDay) {
            if (birdVisitCount == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalBirdsVisited = 0;

        for (int i = 0; i < numberOfDays; i++) {
            if (i >= this.birdsPerDay.length) {
                break;
            }

            totalBirdsVisited += this.birdsPerDay[i];            
        }

        return totalBirdsVisited;
    }

    public int getBusyDays() {
        int busyDayCount = 0;

        for (int birdVisited : this.birdsPerDay) {
            if (birdVisited >= 5) {
                busyDayCount += 1;
            }
        }

        return busyDayCount;
    }
}
