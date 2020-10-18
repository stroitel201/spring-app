package com.stroitel.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("skrillex")
public class EDMMusic implements Music{

    private List<String> songList = Arrays.asList("Poison", "Virus", "Bangarang");

    @Override
    public List<String> getSong() {
        return songList;
    }
}
