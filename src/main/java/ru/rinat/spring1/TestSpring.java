package ru.rinat.spring1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);

        for (int i = 0; i < 5; i++) {
            computer.playMusic();
        }

        context.close();
    }
}
