package ru.netology.javaqa.hwoop2.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldNotSetVolumeAboveMax () { // громкость не должна быть больше максимума
        Radio radio = new Radio(100);
        radio.setCurrentVolume(150);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeBelowMin () { // громкость не должна быть меньше минимума
        Radio radio = new Radio(100);
        radio.setCurrentVolume(-200);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUp() { // увеличение громкости на единицу
        Radio radio = new Radio(100);
        radio.setCurrentVolume(84);
        radio.increaseVolume();

        int expected = 85;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeNotUpAboveMax() { // при увеличении громкости, она не должна стать больше максимума
        Radio radio = new Radio(100);
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDown() { // уменьшение громкости на единицу
        Radio radio = new Radio(100);
        radio.setCurrentVolume(75);
        radio.decreaseVolume();

        int expected = 74;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeNotDownBelowMin() { // при уменьшении громкости, она не должна стать меньше минимума
        Radio radio = new Radio(100);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(31);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationNext() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationPrev() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(15);
        radio.prevStation();

        int expected = 14;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotNextNumberStationAboveMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotPrevNumberStationBelowMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 29;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
