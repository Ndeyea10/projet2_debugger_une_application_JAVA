package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	/**
	 * allows to sort in alphabetical order and to count for each symptom the number of occurrences
	 * @param symptoms list and creates a TreeMap to check for each symptom the number of occurrences
	 * @return the list of different symptoms with their occurrence.
	 */
	public TreeMap<String,Integer> countSymptoms(List<String> symptoms) {

		TreeMap<String, Integer> listSymptoms = new TreeMap<>();
		if (listSymptoms != null) {
			for (String symptom : symptoms) {
				if (!listSymptoms.containsKey(symptom)){
					listSymptoms.put(symptom, 1);
				}
				else {
					int value = listSymptoms.get(symptom);
					value++;
					listSymptoms.put(symptom, value);
				}
			}
		}

		return listSymptoms;

	}

	/**
	 *allows to describe in a new text file a TreeMap containing the different symptoms and their occurrence.
	 * @param symptoms a TreeMap containing the different symptoms and their occurrence
	 *        			in order to write them in a text file.
	 */
	public void writeResultInFile(TreeMap<String, Integer> symptoms ) throws IOException {

		FileWriter writer = new FileWriter ("result.txt");
		for(Map.Entry<String, Integer> entry: symptoms.entrySet()){
			writer.write(entry.getKey() +": " +entry.getValue());
			writer.write('\n');
		}
		writer.close();
	}
}
