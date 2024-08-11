package ru.netology;

public class Radio {
    private int numberOfCurrentRadiostaion;
    private int currentVolume;

    public int getNumberOfCurrentRadiostaion() {
        return numberOfCurrentRadiostaion;
    }

    public void setCurrentNumberRadioStation(int newNumberRadioStation) {
        if (newNumberRadioStation < 0) {
            return;
        }
        if (newNumberRadioStation > 9) {
            return;
        }
        numberOfCurrentRadiostaion = newNumberRadioStation;
    }

    public void nextNumber() {
        if (numberOfCurrentRadiostaion < 9) {
            numberOfCurrentRadiostaion = numberOfCurrentRadiostaion + 1;
        } else {
            numberOfCurrentRadiostaion = 0;
        }
    }

    public void prevNumber() {
        if (numberOfCurrentRadiostaion > 0) {
            numberOfCurrentRadiostaion = numberOfCurrentRadiostaion - 1;
        } else {
            numberOfCurrentRadiostaion = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void reductionVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}


