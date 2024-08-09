package ru.rinat.spring1;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getInstance() {
        System.out.println("ClassicalMusic.getInstance()");
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Symphony #12";
    }

    public void doMyInit() {
        System.out.println("ClassicalMusic.doMyInit()");
    }

    public void doMyDestroy() {
        System.out.println("ClassicalMusic.doMyDestroy()");
    }
}
