package com.hcl.io_exercise_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciseOne {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "939-4545";// br.readLine();

		String prefix = input.substring(0, 3);
		String suffix = input.substring(4, input.length());

		String[] aSuffix = suffix.split("");
		String[] aPrefix = prefix.split("");

		int[] iPrefix = Arrays.stream(aPrefix).mapToInt(Integer::parseInt).toArray();
		int[] iSuffix = Arrays.stream(aSuffix).mapToInt(Integer::parseInt).toArray();

		ArrayList<List<String>> vals = new ArrayList<List<String>>();

		Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
		// create list one and store values
		List<String> valSetTwo = new ArrayList<String>();
		valSetTwo.add("A");
		valSetTwo.add("B");
		valSetTwo.add("C");

		// create list two and store values
		List<String> valSetThree = new ArrayList<String>();
		valSetThree.add("D");
		valSetThree.add("E");
		valSetThree.add("F");

		// create list three and store values
		List<String> valSetFour = new ArrayList<String>();
		valSetFour.add("G");
		valSetFour.add("H");
		valSetFour.add("I");

		// create list five and store values
		List<String> valSetFive = new ArrayList<String>();
		valSetFive.add("J");
		valSetFive.add("K");
		valSetFive.add("L");

		// create list six and store values
		List<String> valSetSix = new ArrayList<String>();
		valSetSix.add("M");
		valSetSix.add("N");
		valSetSix.add("O");
		
		// create list seven and store values
		List<String> valSetSeven = new ArrayList<String>();
		valSetSeven.add("P");
		valSetSeven.add("Q");
		valSetSeven.add("R");
		valSetSeven.add("S");
		
		// create list eight and store values
		List<String> valSetEight = new ArrayList<String>();
		valSetEight.add("T");
		valSetEight.add("U");
		valSetEight.add("V");
		
		// create list nine and store values
		List<String> valSetNine = new ArrayList<String>();
		valSetNine.add("W");
		valSetNine.add("X");
		valSetNine.add("Y");
		valSetNine.add("Z");

		// put values into map
		map.put(2, valSetTwo);
		map.put(3, valSetThree);
		map.put(4, valSetFour);
		map.put(5, valSetFive);
		map.put(6, valSetSix);
		map.put(7, valSetSeven);
		map.put(8, valSetEight);
		map.put(9, valSetNine);

		for (int i = 0; i < iPrefix.length; i++) {
			if (map.containsKey(iPrefix[i])) {
				// Okay, there's a key but the value is null
//				System.out.println(map.get(iPrefix[i]));
				vals.add(map.get(iPrefix[i]));
			} else {
				// Definitely no such key
				System.out.println("can not find");
			}
		}
		for (int i = 0; i < iSuffix.length; i++) {
			if (map.containsKey(iSuffix[i])) {
				// Okay, there's a key but the value is null
//				System.out.println(map.get(iSuffix[i]));
				vals.add(map.get(iSuffix[i]));
			} else {
				// Definitely no such key
				System.out.println("can not find");
			}
		}
		System.out.println(vals);
		
		for (int i =0; i<vals.size(); i++) {
			for (int j = 0; j<vals.get(i).size(); j++) {
				System.out.println(vals.get(i).get(j));
				
			}
		}
	}
}
