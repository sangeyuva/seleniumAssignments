package SelLearning;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest12 {
public static void main(String[] args) {
		
		int a[]={3, 2, 11, 4, 6, 7};
		
		List<Integer> lis = new ArrayList<Integer>();
		
		for(Integer kk : a)
		{
			lis.add(kk);
		}
	
		int mm = lis.size();
		//System.out.println(mm);
		Collections.sort(lis);
		
		
		System.out.println(lis.get(lis.size()-2));
	
		
		
	}

}


