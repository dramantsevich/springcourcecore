package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> music = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        music.forEach(m -> System.out.println(m.getSong()));
    }
}
