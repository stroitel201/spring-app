package com.stroitel.spring;

import org.springframework.stereotype.Component;

@Component("skrillex")
public class EDMMusic implements Music{

    @Override
    public String getSong() {
        return "Bangarang";
    }
}
