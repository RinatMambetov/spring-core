package ru.rinat.spring1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();

    RockMusic() {
        songs.add("Rock music 1");
        songs.add("Rock music 2");
        songs.add("Rock music 3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
