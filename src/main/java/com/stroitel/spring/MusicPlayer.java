package com.stroitel.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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
    public void setMusic2(@Qualifier("linkinPark") Music music2) {
        this.music2 = music2;
    }

    @Autowired
    private List<Music> musicList;

    public List<Music> getMusicList() {
        return musicList;
    }

    @PostConstruct
    private void initMethod(){
        System.out.println("init");
    }

    @PreDestroy
    private void destroyMethod(){
        System.out.println("destroy");
    }

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(){
        System.out.println("construct");
    }

    public void playMusic(MusicGenre genre){

        if(genre == MusicGenre.EDM)
            System.out.println(music1.getSongs().get(new Random().nextInt(3)));
        if(genre == MusicGenre.ROCK)
            System.out.println(music2.getSongs().get(new Random().nextInt(3)));
    }

}
