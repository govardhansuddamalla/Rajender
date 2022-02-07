package com.org.project.utills;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class DataUtils {


    public static String generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(999999) + "";
    }
}
