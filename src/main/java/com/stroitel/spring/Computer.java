package com.stroitel.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    @Autowired
    private MusicPlayer musicPlayer;

    public void startPlayer(){
        musicPlayer.playMusic(MusicPlayer.MusicGenre.EDM);
        musicPlayer.playMusic(MusicPlayer.MusicGenre.ROCK);
    }
}
