package com.lru.cache;

import java.util.HashMap;

public class LRUCache {

	private  HashMap<Integer, Node> map;
	private int capacity;
	private  Node head;
	private  Node tail;

	
	
	public LRUCache(int capacity){
		this.capacity = capacity;
		this.map = new HashMap<>();
		head = new Node(0,0);
		tail = new Node(0,0);
		
		this.head.nxt=this.tail;
		this.tail.prev = this.head;
	}

	public int get(int key) {
		if(!map.containsKey(key)) {
			return -1;
		}
		Node node = map.get(key);
		remove(node);
		add(node);
		return node.val;
	}

	private void remove(Node node) {
		
		Node prevNode = node.prev;
		Node nxtNode = node.nxt;
		prevNode.nxt = nxtNode;
		nxtNode.prev = prevNode;
	}

	private void add(Node node) {
		  Node nextNode = head.nxt;
	        head.nxt = node;
	        node.prev = head;
	        node.nxt = nextNode;
	        nextNode.prev = node;
	}

	void put(int key, int value) {
        if (map.containsKey(key)) {
            Node oldNode = map.get(key);
            remove(oldNode);
        }

        Node node = new Node(key, value);
        map.put(key, node);
        add(node);

        if (map.size() > capacity) {
            Node nodeToDelete = tail.prev;
            remove(nodeToDelete);
            map.remove(nodeToDelete.key);
        }
    }
	
}
