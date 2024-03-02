package javaChallenge;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class ListBookStore {
	
		public static void main(String[] args) {
		
		List<Books23> b1 = new ArrayList<Books23>();
		b1.add(new Books23("R.J.Rowling","Harrypotter","90"));
		b1.add(new Books23("klo","Titanic", "77"));
		
		
		
		
		
		for(Books23 b2 : b1)
		{			
			
			System.out.println(b2.getBookAuthor());
			System.out.println(b2.getBookName());
			System.out.println(b2.getBookPrice());
			
		}
		
		
		
		
	}

}

