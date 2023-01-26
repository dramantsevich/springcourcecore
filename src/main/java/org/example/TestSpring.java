package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(classicalMusic);

        musicPlayer1.playMusic();

        Music rockMusic = context.getBean("rockMusic", RockMusic.class);

        MusicPlayer musicPlayer2 = new MusicPlayer(rockMusic);

        musicPlayer2.playMusic();

        context.close();
    }
}
