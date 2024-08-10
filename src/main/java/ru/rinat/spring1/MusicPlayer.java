package ru.rinat.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private final Music music1;
    private final Music music2;
    private final Music music3;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(
            @Qualifier("classicalMusic") Music music1,
            @Qualifier("jazzMusic") Music music2,
            @Qualifier("rockMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    String randomSong(List<String> songs) {
        int index = new Random().nextInt(songs.size());
        return songs.get(index);
    }

    public void play(MusicType musicType) {
        switch (musicType) {
            case CLASSICAL:
                System.out.println(randomSong(music1.getSongs()));
                return;
            case JAZZ:
                System.out.println(randomSong(music2.getSongs()));
                return;
            case ROCK:
                System.out.println(randomSong(music3.getSongs()));
                return;
            default:
        }
    }
}
