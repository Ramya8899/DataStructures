package com.ds;

public class DoubleLinkedListimptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleLinkedListimp dl = new DoubleLinkedListimp();
		dl.createDoubleLinkedNode(5);
		
		//System.out.println(dl.head.value);
		dl.insertToList(1, 0);
		dl.insertToList(2, 1);
		dl.insertToList(3, 3);
		//System.out.println(dl.head.value);
		//dl.traverseCircleListedList();
		dl.deleteNode(0);
		//dl.revtraverseCircleListedList();
		dl.traverseCircleListedList();
		
		
	}

}
