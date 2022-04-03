package com.ds;

public class DoubleLinkedListimp {
	
	DoubleLinkedNode head;
	DoubleLinkedNode tail;
	int size;
	
	public DoubleLinkedNode createDoubleLinkedNode(int value)
	{
		DoubleLinkedNode node = new DoubleLinkedNode();
		node.value = value;
		head= node;
		node.prev  = null;
		node.next = null;
		tail = node;
		size++;
		return node;
	}
	
	public void insertToList(int value,int loc)
	{
		DoubleLinkedNode node = new DoubleLinkedNode();
		node.value = value;
		if(head == null)
		{
			createDoubleLinkedNode(value);
			return;
		}
		else if(loc==0)
		{
			
			node.prev = null;
			node.next = head;
			head.prev = node;
			head = node;
			
			
		}
		else if(loc >= size)
		{
			node.prev = tail;
			node.next = null;
			tail.next = node;
			tail = node;
			
		}
		else
		{
			DoubleLinkedNode temp = head;
			for(int i =0;i<loc-1;i++)
			{
				temp = temp.next;
			}
			node.next = temp.next;
			node.prev =temp;
			temp.next = node;
			node.next.prev = node;
			
		}
		size++;
		
	}
	
	public void traverseCircleListedList()
	{
		if(head == null)
		{
			System.out.println("singleLinkedList dnt exist");
		}
		else
		{
			DoubleLinkedNode tempNode = head;
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
	
	public void revtraverseCircleListedList()
	{
		if(head == null)
		{
			System.out.println("singleLinkedList dnt exist");
		}
		else
		{
			DoubleLinkedNode tempNode = tail;
			for(int i =0;i<size;i++)
			{
				System.out.print(tempNode.value);
				if(i!=size-1)
				{
					System.out.print("<--");
				}
				
				tempNode = tempNode.prev;
			}
			
		}
		System.out.println("\n");
	}
	
	
	public boolean searchNode(int value)
	{
		
		if(head == null)
		{
			return false;
		}
		else
		{
			DoubleLinkedNode temp = tail;
			for(int i =0;i<size;i++)
			{
				if(temp.value == value)
				{
					return true;
				}
				temp = temp.prev;
			}
		}
		return false;
	}
	
	public void deleteNode(int node)
	{
		if(head == null)
		{
			return;
		}
		else if(node == 0)
		{
			head = head.next;
			head.prev = null;
		}
		else if (node == size-1)
		{
			tail = tail.prev;
			tail.next = null;
			
		}
		else
		{
			DoubleLinkedNode temp = head;
			for(int i =0;i<node;i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp.next;
		}
	}

}
