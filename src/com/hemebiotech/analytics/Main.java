package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        AnalyticsCounter counter = new AnalyticsCounter();
        ISymptomReader read= new ReadSymptomDataFromFile("symptoms.txt");
        System.out.println(read.getSymptoms());

        TreeMap<String, Integer> distinctSymptoms = counter.countSymptoms(read.getSymptoms());
         counter.writeResultInFile(distinctSymptoms);
        System.out.println(counter.countSymptoms(read.getSymptoms()));

    }
}
