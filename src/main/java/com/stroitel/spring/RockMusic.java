package com.stroitel.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songList = Arrays.asList("Wind cries Mary", "Rhapsody", "Numb");

    @Override
    public List<String> getSong() {
        return songList;
    }
}
