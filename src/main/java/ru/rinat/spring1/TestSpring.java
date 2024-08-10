package ru.rinat.spring1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);

        for (MusicType musicType : MusicType.values()) {
            computer.playMusic(musicType);
        }

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

//        System.out.println("Before getBean rockMusic");
//        Music rockMusic1 = context.getBean("rockMusic", Music.class);
//        Music rockMusic2 = context.getBean("rockMusic", Music.class);
//        System.out.println(rockMusic1 == rockMusic2);

        context.close();
    }
}
