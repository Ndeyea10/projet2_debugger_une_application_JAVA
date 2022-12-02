package com.hemebiotech.analytics;

public class Main {
    public static void main(String[] args) {
        AnalyticsCounter counter = new AnalyticsCounter();
        ISymptomReader read= new ReadSymptomDataFromFile("symptoms.txt");
        System.out.println(read.getSymptoms());
        System.out.println(counter.countSymptoms(read.getSymptoms()));

    }
}
