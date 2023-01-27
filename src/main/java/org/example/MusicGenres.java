package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicGenres {
    private final ArrayList<Music> musicList = new ArrayList<>();

    public MusicGenres(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        setMusic(classicalMusic, rockMusic, rapMusic);
    }

    public List<Music> setMusic(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.musicList.add(classicalMusic);
        this.musicList.add(rockMusic);
        this.musicList.add(rapMusic);

        return musicList;
    }

    public Music getRandomMusic() {
        return musicList.get(new Random().nextInt(musicList.size()));
    }
}
