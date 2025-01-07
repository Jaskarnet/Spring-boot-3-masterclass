package net.jaskar.springcoredemo.rest;

import net.jaskar.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    // define a setter for a dependency injection
    @Autowired
    public void setCoach(Coach theCoach) {
        this.myCoach = theCoach;
    }
}
