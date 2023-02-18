package ru.netology.qa54.radio;

public class Radio {

    private final int minStation = 0;
    private final int maxStation;
    private int currentStation;
    private int loudSound;
    private final int minLoud = 0;
    private final int maxLoud = 100;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int amountStations) {
        this.maxStation = amountStations - 1;
    }


    public int getCurrentStation() {
        return currentStation;

    }

    public int getLoudSound() {
        return loudSound;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        this.currentStation = newCurrentStation;

    }

    public void setToNextStation() {

        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
        } else {
            this.currentStation = currentStation + 1;
        }

    }

    public void setToPrevStation() {

        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public void setLoudSound(int newLoudSound) {

        if (newLoudSound > maxLoud) {
            return;
        }
        if (newLoudSound < minLoud) {
            return;
        }
        loudSound = newLoudSound;

    }

    public void increaseLoud() {

        if (loudSound < maxLoud) {
            loudSound = loudSound + 1;
        } else {
            setLoudSound(maxLoud);
        }

    }

    public void downLoud() {

        if (loudSound > minLoud) {
            loudSound = loudSound - 1;
        } else {
            setLoudSound(minLoud);
        }

    }


}

