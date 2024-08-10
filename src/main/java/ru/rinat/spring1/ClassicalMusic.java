package ru.rinat.spring1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    ClassicalMusic() {
        songs.add("Classical music 1");
        songs.add("Classical music 2");
        songs.add("Classical music 3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

    @Override
    public String getRandomSong() {
        return songs.get(new Random().nextInt(songs.size()));
    }
}
