package ru.netology.qa54.radio;

public class Radio {

    private int currentStation;
    private final int minStation = 0;
    private final int maxStation = 9;
    private int loudSound;
    private final int minLoud = 0;
    private final int maxLoud = 10;

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
        currentStation = newCurrentStation;

    }

    public void setToNextStation() {

        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
        } else {
            currentStation = currentStation + 1;
        }

    }

    public void setToPrevStation() {

        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            currentStation = currentStation - 1;
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
