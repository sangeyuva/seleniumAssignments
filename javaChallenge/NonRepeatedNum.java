package javaChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NonRepeatedNum {
	
	public static void main(String[] args) {
		int[] nums = {2,2,1};
		Arrays.sort(nums);
		Set <Integer> st = new HashSet<Integer>();
		for (int n : nums)
		{
			if (st.contains(n)) {
                st.remove(n);
            } else {
                st.add(n);
            }
        }
		List<Integer> ls = new ArrayList<Integer>(st);
		System.out.println(ls);
		System.out.println(ls.get(0));
		
	}
}
