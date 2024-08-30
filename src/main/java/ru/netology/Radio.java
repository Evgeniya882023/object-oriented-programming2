package ru.netology;

public class Radio {
    private int quantityRadioStations = 10;
    private int minRadiostation = 0;
    private int maxRadiostation = 9;
    private int numberOfCurrentRadiostaion = minRadiostation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int quantityRadioStations) {
        this.quantityRadioStations = quantityRadioStations;
    }

    public Radio() {
    }

    public int getMinRadiostation() {
        return minRadiostation;
    }

    public int getMaxRadiostation() {
        return maxRadiostation;
    }

    public int getNumberOfCurrentRadiostaion() {
        return numberOfCurrentRadiostaion;
    }

    public void setCurrentNumberRadioStation(int newNumberRadioStation) {
        if (newNumberRadioStation < minRadiostation) {
            return;
        }
        if (newNumberRadioStation > maxRadiostation) {
            return;
        }
        numberOfCurrentRadiostaion = newNumberRadioStation;
    }

    public void nextNumber() {
        if (numberOfCurrentRadiostaion < maxRadiostation) {
            numberOfCurrentRadiostaion = numberOfCurrentRadiostaion + 1;
        } else {
            numberOfCurrentRadiostaion = minRadiostation;
        }
    }

    public void prevNumber() {
        if (numberOfCurrentRadiostaion > minRadiostation) {
            numberOfCurrentRadiostaion = numberOfCurrentRadiostaion - 1;
        } else {
            numberOfCurrentRadiostaion = maxRadiostation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reductionVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}




