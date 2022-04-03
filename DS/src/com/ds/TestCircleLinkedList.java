package com.ds;

public class TestCircleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircleDoubleLinkedList cdl = new CircleDoubleLinkedList();
		cdl.createCircleDoubleLinkedList(5);
		System.out.println(cdl.head.next.value);
		cdl.insertCCDL(1,0);
		cdl.insertCCDL(2, 2);
		cdl.insertCCDL(4,3);
		cdl.traverseCircleListedList();
	}

}
