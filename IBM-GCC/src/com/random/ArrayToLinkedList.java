package com.random;

public class ArrayToLinkedList {
	
 public static Node convert(int[] arr) {
	 
	 if(arr.length==0) {
		 return null;
	 }
	 
	 Node head = new Node(arr[0]);
	 Node current = head;
	 
	 for(int i =1;i<arr.length;i++) {
		 current.next = new Node(arr[i]);
		 current = current.next;
	 }
	return head;
 }
 
 public  static void printList(Node head) {
	 Node temp = head;
	 while(temp!=null) {
		 System.out.print(temp.data+"->");
		 temp = temp.next;
	 }
	 
	 System.out.println("null");
 }

 public static void main(String[] args) {
	 int[] arr= {1,2,3,4};
	 Node head = convert(arr);
	 printList(head);
 }
 
}
