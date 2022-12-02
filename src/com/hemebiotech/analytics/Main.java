package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        AnalyticsCounter counter = new AnalyticsCounter();
        TreeMap<String, Integer> distinctSymptoms = counter.countSymptoms(counter.readFile());
        counter.writeResultInFile(distinctSymptoms);
        System.out.println(distinctSymptoms);

    }
}
