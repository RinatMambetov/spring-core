package ru.rinat.spring1;

//@Component
public class Computer {
    //    @Autowired
    private final MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void playMusic(MusicType musicType) {
        musicPlayer.play(musicType);
    }
}
