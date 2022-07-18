import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
		List<String> swapped = swapFirstLast(strings);
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
		
		List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 7, 8, 10, 12, 14, 15, 16, 19, 21, 23, 24, 25, 26);

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
