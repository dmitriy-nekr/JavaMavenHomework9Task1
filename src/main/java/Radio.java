public class Radio {
    public int currentStation;
    public int currentVolume;

    public int next() {
        if (currentStation >= 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
        return currentStation;

    }

    public int prev() {
        if (currentStation <= 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
        return currentStation;
    }

    public int setCurrentStation(int newCurrentStation) {
        if (0 <= newCurrentStation) {
            if (newCurrentStation <= 9) {
                currentStation = newCurrentStation;
            }
        }
        return currentStation;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
