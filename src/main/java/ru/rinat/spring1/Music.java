package ru.rinat.spring1;

import java.util.List;

public interface Music {
    List<String> getSongs();

    String getRandomSong();
}
