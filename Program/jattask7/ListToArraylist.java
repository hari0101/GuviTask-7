
//7. Write a Program to convert List to ArrayList

package jattask7;

import java.util.ArrayList;
import java.util.List;

public class ListToArraylist {

	/*
	 * List is an interface in java collection framework, it provides a way to store
	 * an ordered collection of elements.
	 * 
	 * i) The elements in a List are stored by the insertion order. it also allows
	 * duplicate elements.
	 * 
	 * ii) Being an interface list cannot be instantiated directly. Instead, it
	 * provides a blueprint for different implementations like ArrayList,
	 * LinkedList, etc.
	 * 
	 * 
	 * ArrayList is a concrete class in the Java Collections Framework that
	 * implements the List interface. It uses a dynamic array to store the elements.
	 * 
	 * i) Unlike a standard array, ArrayList can dynamically resize itself when
	 * elements are added or removed.
	 * 
	 * ii) Since ArrayList implements the List interface, it inherits all the
	 * methods from List and adds its own specific functionality.
	 * 
	 */

	public static void main(String[] args) {

		// Creating list of element, because of list is an interface we cannot
		// instantiate

		List<String> lists = List.of("Java", "Python", "C#", "JavaScript", "Ruby");

		// Creating the Arraylist to convert the List into Class to instantiate

		ArrayList<String> arraylist = new ArrayList<>(lists);

		// Printing the list to arraylist form

		System.out.println(arraylist);
	}

}
