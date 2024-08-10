package ru.rinat.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    //    @Autowired
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
//    private Music music;

    //    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

//    public void play() {
////        System.out.println("Playing " + music.getSong());
//        System.out.println("Playing " + classicalMusic.getSong());
//        System.out.println("Playing " + rockMusic.getSong());
//    }

    public String play() {
        return "Playing " + classicalMusic.getSong() + " " + rockMusic.getSong();
    }
}
