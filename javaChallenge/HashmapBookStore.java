package javaChallenge;

import java.util.HashMap;
import java.util.Map;

public class HashmapBookStore {
	
	

	public static void main(String[] args) {
		
		Map <String, Books23> bookmap = new HashMap<>();
		bookmap.put("R.J.Rowling", new Books23("R.J.Rowling","Harrypotter","90"));
		bookmap.put("R.J.K.Rowling", new Books23("R.J.K.Rowling","Harrypotte888r","900"));
		
		for(String bMap:bookmap.keySet()) {
			Books23 b3 = bookmap.get(bMap);
			System.out.println(b3.getBookAuthor());
			System.out.println(b3.getBookName());
			System.out.println(b3.getBookPrice());
		}
	}

}
