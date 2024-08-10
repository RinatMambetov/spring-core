package ru.rinat.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);

        for (MusicType musicType : MusicType.values()) {
            computer.playMusic(musicType);
        }

        context.close();
    }
}
