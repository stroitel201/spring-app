package com.stroitel.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;

    private Music music2;

    public enum MusicGenre{
        EDM,
        ROCK
    }

    @Autowired
    public void setMusic1(@Qualifier("skrillex") Music music1) {
        this.music1 = music1;
    }

    @Autowired
    public void setMusic2(@Qualifier("rockMusic") Music music2) {
        this.music2 = music2;
    }


    @Autowired
    private List<Music> musicList;

    public List<Music> getMusicList() {
        return musicList;
    }

    private void initMethod(){
        System.out.println("init");
    }

    private void destroyMethod(){
        System.out.println("destroy");
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;

    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public MusicPlayer(){

    }

    public void playMusic(MusicGenre genre){

        if(genre == MusicGenre.EDM)
            System.out.println(music1.getSong().get(new Random().nextInt(3)));
        if(genre == MusicGenre.ROCK)
            System.out.println(music2.getSong().get(new Random().nextInt(3)));
    }

}
