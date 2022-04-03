package com.ds;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * SingleLinkedList sl = new SingleLinkedList(); sl.createsinglelist(5);
		 * 
		 * sl.insertToLinkedList(6, 1); sl.insertToLinkedList(7, 2);
		 * sl.insertToLinkedList(8, 3); sl.insertToLinkedList(9, 4);
		 * 
		 * sl.traverseSingleListedList(); System.out.println(sl.searchForNode(4));
		 * sl.deleteNode(4); sl.traverseSingleListedList();
		 */
		
		
		CircularLinkedList cl = new CircularLinkedList();
		
		cl.createCircleLinkedList(9);
		cl.insterAtBeginning(1,1);
		cl.insterAtBeginning(2,2);
		cl.insterAtBeginning(3,3);
		cl.insterAtBeginning(4,4);
		cl.insterAtBeginning(5,5);
		
		cl.traverseCircleListedList();
		
		System.out.println(cl.searchInCircleLinkedList(4));
		cl.deleteNode(0);
		cl.traverseCircleListedList();
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
}
