
//6. Write a Java program to create a TreeMap of employee IDs and names. Then, print out the names of all the employees in alphabetical order.

package jattask7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class TreeMaps {

	
	public static void main(String[] args) {
		
		// Create a TreeMap to store employee IDs and names
		TreeMap<Integer, String> emp = new TreeMap<>();
		
		//Adding ID and name as Key-Value pairs
		
		emp.put(12312, "James dan");
		emp.put(12697, "Mark Phan");
		emp.put(13456, "Danielle");
		emp.put(14095, "Ryan reynolds");
		emp.put(15487, "Rock chirstopher");
	
		//Create a list from the values of the TreeMap
		List<String> emplist = new ArrayList<>(emp.values());
		
		//Sorting the value of list using in-built sort method
		Collections.sort(emplist);
		
		System.out.println("The Alphabetical Order of the values " + "\n");
		
		//Printing all the sorted values in TreeMap
		for(String e : emplist)
		{	
			System.out.println(e);
		}
	
		
	
	}

}
