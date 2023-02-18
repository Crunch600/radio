package ru.netology.qa54.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "11,0",
            "-1,0"
    })

    public void shouldSetStation(int valueStation, int expected) {

        radio.setCurrentStation(valueStation);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "9,8,0",
            "20,17,18"
    })

    public void shouldToNextStation(int amountStations, int valueStation, int expected) {
        Radio radio = new Radio( amountStations);
        radio.setCurrentStation(valueStation);

        radio.setToNextStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "10,0,9",
            "10,8,7"
    })

    public void shouldToPrevStation(int amountStationsint, int valueStation, int expected) {
        Radio radio = new Radio(amountStationsint);
        radio.setCurrentStation(valueStation);

        radio.setToPrevStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "-1,0",
            "11,11",
            "101,0"
    })

    public void shouldSetLoudSound(int valueLoud, int expected) {

        radio.setLoudSound(valueLoud);

        int actual = radio.getLoudSound();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "10,11",
            "100,100"
    })

    public void shouldToIncreaseLoud(int valueLoud, int expected) {

        radio.setLoudSound(valueLoud);

        radio.increaseLoud();

        int actual = radio.getLoudSound();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "2,1",
            "0,0"
    })

    public void shouldToDownLoud(int valueLoud, int expected) {

        radio.setLoudSound(valueLoud);

        radio.downLoud();

        int actual = radio.getLoudSound();

        Assertions.assertEquals(expected, actual);

    }

}