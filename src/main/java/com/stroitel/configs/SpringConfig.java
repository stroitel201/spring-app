package com.stroitel.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.stroitel.spring")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

}
