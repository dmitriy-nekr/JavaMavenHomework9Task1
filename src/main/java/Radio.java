public class Radio {
    public int currentStation;
    public int currentVolume;
    public int amountOfStations = 10;
    public int minStation;
    public int maxStation = minStation + amountOfStations - 1;
    public int maxVolume = 100;
    public int minVolume = 0;

    public Radio(int amountOfStations) {
        this.amountOfStations = amountOfStations;
        maxStation=minStation + amountOfStations - 1;
    }

    public Radio() {
        amountOfStations = 10;
    }

    public int next() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
        return currentStation;

    }

    public int prev() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
        return currentStation;
    }

    public int setCurrentStation(int newCurrentStation) {
        if (minStation <= newCurrentStation) {
            if (newCurrentStation <= maxStation) {
                currentStation = newCurrentStation;
            }
        }
        return currentStation;
    }
    
    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
