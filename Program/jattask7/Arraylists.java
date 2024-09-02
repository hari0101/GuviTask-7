
//  5.	Write a Java program to create an ArrayList of strings and then remove all the elements from the ArrayList.

package jattask7;

import java.util.ArrayList;
import java.util.Iterator;

// What is an Arraylist? : Arraylist is part of java's collections framework is used to store dynamically sized collection of elements. 

public class Arraylists {

	// Main method
	public static void main(String[] args) {

		// Creating Arraylist object
		ArrayList<String> code = new ArrayList<>();

		// Adding elements
		code.add("Java");
		code.add("Python");
		code.add("C#");
		code.add("JavaScript");

		// Printing the arraylist element
		System.out.println("ArrayList : " + code + "\n");

		// Accessing single element from the arraylist
		System.out.println("Element present in the 0th index of arraylist : " + code.get(0) + "\n");

		// Accessing all the individual element from the arraylist by for-each loop
		for (String s : code) {
			System.out.print(s + " ");
		}

		// Removed all the elements from the arraylist
		code.removeAll(code);

		System.out.println("\n"); // Line and Spacing

		// Printing the arraylist element after removing
		System.out.println("ArrayList : " + code);

		// (OR)

		// Printing the arraylist element after removing using iterator
		Iterator<String> it = code.iterator();

		// while check the condition if the arraylist have any value or not
		// If has the while loop execute else the loop will not execute
		while (it.hasNext()) {
			String element = it.next();
			System.out.print("Elements after removed : " + element);
		}

	}

}
