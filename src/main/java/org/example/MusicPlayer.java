package org.example;

public class MusicPlayer {
    private final MusicGenres musicList;

    public MusicPlayer(MusicGenres musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        return "Playing" + " " + musicList.getRandomMusic().getSong();
    }
}
