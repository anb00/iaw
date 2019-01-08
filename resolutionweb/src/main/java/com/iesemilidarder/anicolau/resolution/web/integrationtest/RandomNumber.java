package com.iesemilidarder.anicolau.resolution.web.integrationtest;

import java.util.Random;

public class RandomNumber {
    public Integer random() {
        return new Random().nextInt(9000) + 1000;
    }
}
