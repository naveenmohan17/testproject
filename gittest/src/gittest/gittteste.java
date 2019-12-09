package gittest;

import java.util.Arrays;

public class gittteste {
	public static void main(String args[]) {
	String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
			"aug", "Sep", "Oct", "nov", "Dec" };

	// Display input un-sorted list.
	System.out.println("-------Input List-------");
	showList(inputList);

	// Call to sort the input list.
	Arrays.sort(inputList);

	// Display the sorted list.
	System.out.println("\n-------Sorted List-------");
	showList(inputList);

	}

	private static void showList(String[] array) {
		// TODO Auto-generated method stub
		for (String str : array) {
			System.out.print(str + " ");
		
	}	
}
}