import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class lab {

	public static void main(String[] args) {
		
		/*  
		 * why would we use StringBuilder instead of a String
		 */
		// using StringBuilder prevents memory leaks because they are mutable, while String are Immutable.
		
		
		/*
		 * instantiate a new StringBuilder and append the characters 0 through 9 to it
		 * separated by dashes make sure no dashes appear at the end of the
		 * StringBuilder
		 */
		
		StringBuilder integers = new StringBuilder();
		for (int i = 0; i <= 9; i++) {
			integers.append(i);
			if (i != 9) {
				integers.append("-");
			}
		}
		System.out.println(integers.toString() );
		
		
		/*
		 * create a list of Strings and add 5 Strings to it, each with different
		 * lengths
		 */		
		List<String> strings = new ArrayList<String>();
		strings.add("Tom");
		strings.add("Sammy");
		strings.add("Paul");
		strings.add("I");
		strings.add("Me");
		strings.add("Theodore");
		// alternatively, you can set the list equal to Arrays.asList("Tom", "Sammy", "Paul", "I", "Me", "Theodore")
		
		for (String string : strings) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		
		/*
		 * write and test a method that takes a list of strings and returns the shortest
		 * string
		 */
		System.out.println("shortest string: " + findShortestString(strings));
		
		
		/*
		 * write and test a method that takes a list of strings and returns the list
		 * with the first and last element switched
		 */
		List<String> swapped = swapFirstLast(strings); // swapFirstLast permanently changes strings
		for (String string : swapped) {
			System.out.print(string + " ");
		}
		System.out.println();
		

		/*
		 * write and test a method that takes a list of strings and returns a string
		 * with all the list elements concatenated to each other, separated by a comma
		 */
		System.out.println("list combined: " + listCombine(swapped) );
		
		
		/*
		 * write and test a method that takes a list of strings and a string and returns
		 * a new list with all strings from the original list containing the second
		 * string parameter (i.e. like a search method)
		 */
		
		String query = "o";
		List<String> searchResults = listSearch(strings, query);   // ISSUES HERE
		
		System.out.println("Search Results containing \"" + query + "\": ");
		for (String result : searchResults) {
			System.out.println(result);
		}
		
		
		/*
		 * write and test a method that takes a list of integers and returns a List<Lists<Integer>> where the first list
		 * in the returned value contains any number from the input list that is divisible by 2, the second list contains
		 * values from the input list that are divisible by 3, the third divisible by 5, and the fourth all numbers from
		 * the input list not divisible by 2, 3, or 5
		 */
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);
		
		List<List<Integer>> sortedNumbers = divisibleBy235(numbers);
		
		System.out.println("========================");
		for (List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.print(number + " ");
			}
			System.out.println();
			System.out.println("========================");
			System.out.println();
		}
		
		/*
		 *  write and test a method that takes a list of strings and returns a list of integers that contains the
		 *  length of each string
		 */
		
		List<Integer> lengthsList = lengthOfStrings(strings);
		for (int length : lengthsList) {
			System.out.print(length + " ");
		}
		
		/*
		 *  create a set of strings and add 5 values
		 */
		
		Set<String> set = new HashSet<String>();
		
		set.add("Red");
		set.add("Blue");
		set.add("Green");
		set.add("Yellow");
		set.add("Purple");
		set.add("Blurple");
		
		/*
		 *  write and test a method that takes a set of strings and a character and returns a set of strings consisting of
		 *  all the strings in the input set that start with the character parameter
		 */
		System.out.println();
		
		Set<String> results = startsWithLetter(set, 'B');
		for (String string : results) {
			System.out.print(string + " ");
		}
		
		/*
		 *  write and test a method that takes a set of strings and returns a list of the same strings
		 */
		System.out.println();
		
		List<String> newList = setToList(set);
		for (String string : newList) {
			System.out.print(string + " ");
		}
		
		/*
		 *  write and test a method that takes a set of integers and returns a new set of integers containing
		 *  only even numbers from the original set 
		 */
		System.out.println();
		Set<Integer> numberSet = new HashSet<Integer>();
		numberSet.add(3);
		numberSet.add(4);
		numberSet.add(8);
		numberSet.add(33);
		
		Set<Integer> evens = returnEvens(numberSet);
		
		for (Integer number : evens) {
			System.out.print(number + " ");
		}
		
		/*
		 *  create a map of string and string and add 3 items to it where the key of each is a word and the value is
		 *  the definition of the word
		 */
		System.out.println();
		
		Map<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("amphibian", "an animal capable of living both on land and in water.");
		dictionary.put("elastic", "easily resuming original size and shape after being stretched or otherwise deformed.");
		dictionary.put("scholar", "a learned person.");
		
		/*
		 *  write and test a method that takes a Map<String, String> and a string and returns the value for a key in
		 *  the map that matches the string parameter (i.e. like a language dictionary lookup)
		 */
		
		definitionLookup(dictionary, "elastic");

	}
	
	public static String definitionLookup(Map<String, String> map, String string) {
		
		
		return string;
	}
	
	public static Set<Integer> returnEvens(Set<Integer> set) {
		Set<Integer> results = new HashSet<Integer>();
		
		for (int number : set) {
			if (number % 2 == 0) {
				results.add(number);
			}
		}
		return results;
	}
	
	public static List<String> setToList(Set<String> set) {
		List<String> list = new ArrayList<String>();
		
		for (String string : set) {
			list.add(string);
		}
		
		return list;
	}
	
	public static Set<String> startsWithLetter(Set<String> set, char chr) {
		
		Set<String> results = new HashSet<String>();
		
		for (String string : set) {
			if (string.charAt(0) == (chr)) {
				results.add(string);
			}
		}
		return results;
	}
	
	public static List<Integer> lengthOfStrings(List<String> list) {
		
		List<Integer> lengths = new ArrayList<Integer>();
		
		for (String string : list) {
			lengths.add(string.length() );
		}
		
		return lengths;
	}
	
	public static List<List<Integer>> divisibleBy235(List<Integer> list) {
		List<List<Integer>> divisLists = new ArrayList<List<Integer>>();
		
		divisLists.add(new ArrayList<Integer>() );
		divisLists.add(new ArrayList<Integer>() );
		divisLists.add(new ArrayList<Integer>() );
		divisLists.add(new ArrayList<Integer>() );
		
		// use if and not else if b/c some numbers fall into multiple lists
		for (int number : list) {
			if (number % 2 == 0) {
				divisLists.get(0).add(number);
			}
			if (number % 3 == 0) {
				divisLists.get(1).add(number);
			}
			if (number % 5 == 0) {
				divisLists.get(2).add(number);
			}
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0){
				divisLists.get(3).add(number);
			}
		}
		
		return divisLists;
	}
	
	public static List<String> listSearch(List<String> list, String query) {
		List<String> searchResults = new ArrayList<String>();
		
		for (String string : list) {
			if (string.contains(query) ) {
				searchResults.add(string);
			}
		}
		return searchResults;
	}
	
	public static String listCombine(List<String> list) {
		StringBuilder newString = new StringBuilder();
		for (String string : list) {
			newString.append(string + ", ");
		}
		newString.delete(newString.length() - 2 , newString.length() - 1);
		return newString.toString();
	}
	
	public static List<String> swapFirstLast(List<String> list) {
		String newLast = list.get(0);
		
		list.set(0, list.get(list.size() - 1) );
		list.set(list.size() - 1, newLast);
		
		return list;
	}
	
	public static String findShortestString(List<String> list) {
		String shortest = list.get(0);
		
		for (String string : list) {
			if (string.length() < shortest.length() ) {
				shortest = string;
			}
		}
		return shortest;
	}

}
