package com.ds;

public class CircleDoubleLinkedList {
	CircleNode head;
	CircleNode tail;
	int size;
	
	public CircleNode createCircleDoubleLinkedList(int value)
	{
		CircleNode node = new CircleNode();
		node.value = value;
		node.next = node;
		node.prev = node;
		head = node;
		tail = node;
		size++ ;
		return node;
	}
	
	public void insertCCDL(int value,int loc)
	{
		CircleNode node = new CircleNode();
		if(head == null)
		{
			createCircleDoubleLinkedList(value);
		}
		else if(loc == 0)
		{
			head.prev = node;
			node.value = value;
			node.prev = tail;
			node.next = head;
			head = node;
			size++;
			
		}
		else if(loc>=size)
		{
			node.value = value;
			node.prev = tail;
			node.next = head;
			tail.next = node;
			tail = node;
			head.prev = tail;
			size++;
		}
		else
		{
			CircleNode tempnode = head;;
			node.value = value;
			for(int i =0;i<loc;i++)
			{
				tempnode = tempnode.next;
			}
			node.next = tempnode.next;
			node.prev = tempnode;
			tempnode.next.prev = node;
			tempnode.next = node;
			size++;
			
		}
		
	}
	
	public void traverseCircleListedList()
	{
		if(head == null)
		{
			System.out.println("LinkedList dnt exist");
		}
		else
		{
			CircleNode tempNode = head;
			for(int i =0;i<size;i++)
			{
				System.out.print(tempNode.value);
				if(i!=size-1)
				{
					System.out.print("-->");
				}
				
				tempNode = tempNode.next;
			}
			
		}
		System.out.println("\n");
	}
	
	public void deletenodeCDL(int node)
	{
		
	}

}
