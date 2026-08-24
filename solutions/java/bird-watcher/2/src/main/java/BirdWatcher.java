
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        int arrSize = this.birdsPerDay.length;

        if (arrSize == 0) {
            return -1;
        }

        return this.birdsPerDay[arrSize - 1];
    }

    public void incrementTodaysCount() {
        int arrSize = this.birdsPerDay.length;

        if (arrSize == 0) {
            return;
        }

        this.birdsPerDay[arrSize - 1]++;
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
