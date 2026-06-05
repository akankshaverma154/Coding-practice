package com.dsa.custom.map;

public class CustomMap<K,V> {
	
	private Entry<K,V>[] bucket;
	private static final int INITIAL_CAPACITY = 1<<4;
	
	private int size = 0;
	
	public CustomMap() {
		this(INITIAL_CAPACITY);
	}

	public CustomMap(int initialCapacity) {
		// TODO Auto-generated constructor stub
		this.bucket = new Entry[initialCapacity];
	}

	/*
	 * public void put(K key, V value) { Entry<K,V> entry = new Entry<>(key, value,
	 * null); int bucket = getHash(key) % getBucketSize();
	 * 
	 * }
	 */
	
}
