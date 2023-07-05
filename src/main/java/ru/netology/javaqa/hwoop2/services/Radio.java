package ru.netology.javaqa.hwoop2.services;
public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;

    public Radio(int size) {
        maxStation = size - 1;
    }

    public Radio () {
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) { // задаем сеттер
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() { // увеличение громкости
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            int volume = currentVolume;
            setCurrentVolume(volume);
        }
    }
    public void decreaseVolume() { // уменьшение громкости
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            int volume = currentVolume;
            setCurrentVolume(volume);
        }
    }

    public void setCurrentStation(int newStation) {
        if (newStation < minStation) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() { // переход на следующую радиостанцию
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() { // переход на предыдущую радиостанцию
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
}


