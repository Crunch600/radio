package ru.netology.qa54.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "11,0",
            "-1,0"
    })

    public void shouldSetStation(int valueStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(valueStation);

        //int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "1,2",
            "9,0"
    })

    public void shouldToNextStation(int valueStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(valueStation);

        radio.setToNextStation();

        //int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "8,7"
    })

    public void shouldToPrevStation(int valueStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(valueStation);

        radio.setToPrevStation();

        //int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "-1,0",
            "11,0"
    })

    public void shouldSetLoudSound(int valueStation, int expected) {
        Radio radio = new Radio();

        radio.setLoudSound(valueStation);

        //int expected = 5;
        int actual = radio.getLoudSound();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "10,10"
    })

    public void shouldToIncreaseLoud(int valueStation, int expected) {
        Radio radio = new Radio();
        radio.setLoudSound(valueStation);

        radio.increaseLoud();

        //int expected = 4;
        int actual = radio.getLoudSound();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "2,1",
            "0,0"
    })

    public void shouldToDownLoud(int valueStation, int expected) {
        Radio radio = new Radio();
        radio.setLoudSound(valueStation);

        radio.downLoud();

        //int expected = 6;
        int actual = radio.getLoudSound();

        Assertions.assertEquals(expected, actual);

    }

}
