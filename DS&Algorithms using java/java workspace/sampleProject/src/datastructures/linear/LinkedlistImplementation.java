package datastructures.linear;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedlistImplementation {

			public static void main(String[] args) {
				LinkedList<String> ll=new LinkedList<>();
				ll.add("robin");
				ll.add("saurabh");
				ll.add("varun singla");
				ll.add("Bob");
				
				Iterator<String> itr =ll.iterator();
				while(itr.hasNext()){
					System.out.println(itr.next());
				};

			}

		

	

}
