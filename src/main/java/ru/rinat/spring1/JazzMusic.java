package ru.rinat.spring1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music {
    List<String> songs = new ArrayList<>();

    JazzMusic() {
        songs.add("Jazz music 1");
        songs.add("Jazz music 2");
        songs.add("Jazz music 3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
