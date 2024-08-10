package ru.rinat.spring1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
//@Scope("singleton")
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

    @PostConstruct
    void doMyInit() {
        System.out.println("doMyInit RockMusic");
    }

    @PreDestroy
    void doMyDestroy() {
        System.out.println("doMyDestroy RockMusic");
    }
}
