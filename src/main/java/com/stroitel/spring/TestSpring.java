package com.stroitel.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = new MusicPlayer(context.getBean("musicBean", Music.class));

        musicPlayer.playMusic();

        context.close();
    }
}
