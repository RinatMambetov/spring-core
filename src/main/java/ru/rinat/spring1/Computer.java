package ru.rinat.spring1;

public class Computer {
    private final MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void playMusic() {
        musicPlayer.playRandom();
    }
}
