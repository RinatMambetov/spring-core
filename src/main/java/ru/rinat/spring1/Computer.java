package ru.rinat.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    private MusicPlayer musicPlayer;

    public void playMusic(MusicType musicType) {
        musicPlayer.play(musicType);
    }
}
