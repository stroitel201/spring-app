package com.stroitel.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Component
public class MusicPlayer {

    private Music music;

    @Autowired
    private EDMMusic edmMusic;

    public EDMMusic getEdmMusic() {
        return edmMusic;
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

    public void playMusic(){
        for (Music music:
             musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public void playSong(){
        System.out.println(music.getSong());
    }

}
