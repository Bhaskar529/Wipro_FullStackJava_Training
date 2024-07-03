package datastructures.nonlinear;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> hashObj=new Hashtable<>();
		hashObj.put(1,"Alex");
		hashObj.put(2,"Bob");
		hashObj.put(3,"Clare");
		
		System.out.println(hashObj);
	}

}
