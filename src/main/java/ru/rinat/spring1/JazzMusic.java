package ru.rinat.spring1;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Summertime";
    }
}
