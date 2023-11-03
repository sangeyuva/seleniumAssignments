package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class missingElementList {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 10, 6, 8,12,14,16,19,25 };

		List<Integer> mElement = new ArrayList<>();

		
	//	For loop To add array elements to List
		for (int i = 0; i < a.length; i++) {
			mElement.add(a[i]);
		}

		Collections.sort(mElement); // {1,2,3,4,6,8,10,12,14,16,19  size = 11 
		System.out.println(mElement);
		System.out.println(mElement.size());
		int kk = mElement.size();

//		int i=1;
//	    while(i< mElement.size()) {
//	        if (mElement.get(i) - mElement.get(i-1) == 1) {
//
//	        } else {
//	            System.out.println("Missing number is " + (mElement.get(i-1) + 1));
//	            
//	        
//	        }
//	      i++;
//	    }
//mElement.get(mElement.size()) 
		
		
		
		for(int i=0;i<kk-1;i++)
        {
            if(mElement.get(i+1)-mElement.get(i)>1)
            {
                int temp=mElement.get(i+1)-mElement.get(i);
                for(int j=1;j<temp;j++) 
                {
                 System.out.print(mElement.get(i)+j + " ");
                }
                temp=0;
            }
        }
	    }
}

//QA
//how to add string to this multiple exp line 48

