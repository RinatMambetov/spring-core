package ru.rinat.spring1;

import org.springframework.stereotype.Component;

@Component()
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Symphony #12";
    }
}
