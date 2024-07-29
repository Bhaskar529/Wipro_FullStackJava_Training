package com.wipro.service;
/**
* Generic class
*/
public class OrderedPair<K,V> implements Pair<K,V> {
	
	private K key;
	private V value;
	
	public OrderedPair() {
		
	}
	public OrderedPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() {
		return this.key;
	}
	@Override
	public V getValue() {
		return this.value;
	}


	@Override
	public String toString() {
		return "OrderedPair [key=" + key + ", value=" + value + "]";
	}


}




