package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortUsingCollection {
	public static void main(String[] args) {

		String[] a = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		List<String> sort1 = new ArrayList<String>(Arrays.asList(a));
		System.out.println(sort1);
//To Sort the list in Ascending Order
		// Collections.sort(sort1);
		// System.out.println(sort1);

		//To print list in descending Order
		Collections.sort(sort1, Collections.reverseOrder());
		System.out.println(sort1);

	}
}
