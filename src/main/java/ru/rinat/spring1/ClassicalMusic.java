package ru.rinat.spring1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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
}
