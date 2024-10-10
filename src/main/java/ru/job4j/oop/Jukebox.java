package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String selectedSong = switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спокойной ночи";
            default -> "Песня не найдена";
        };
        System.out.println(selectedSong);
    }

    public static void main(String[] args) {
        Jukebox jukeboxInstance = new Jukebox();
        jukeboxInstance.music(6);
    }
}
