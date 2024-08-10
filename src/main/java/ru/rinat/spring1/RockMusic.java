package ru.rinat.spring1;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Enter sandman";
    }
}
