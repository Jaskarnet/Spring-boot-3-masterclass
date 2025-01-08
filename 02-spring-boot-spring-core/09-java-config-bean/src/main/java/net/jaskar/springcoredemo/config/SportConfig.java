package net.jaskar.springcoredemo.config;

import net.jaskar.springcoredemo.common.Coach;
import net.jaskar.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
