package com.stack;

public class Linkedlist {
	
	Node head;
	Node tail;
	int size;
	
	public void createLinkedlist(int value)
	{
		//head = new Node();
		Node node = new Node();
		node.value = value;
		node.next = null;
		head = node;
		tail = node;
		size =1;
	}
	
	public void transverse()
	{
		Node temp = head;
		if(head == null)
		{
			System.out.println("LL is null");
		}
		else
		{
			for(int i=1;i<=size;i++)
			{
				System.out.print(temp.value);
				if(i<size)
				{
					System.out.print("-->");
				}
				temp = temp.next;
			}
		}
		
	}
	
	public void insertSSDL(int value)
	{
		Node node = new Node();
		node.value = value;
		if(head == null)
		{
			createLinkedlist(value);
			return;
		}
		else
		{
			node.next = null;
			tail.next = node;
			tail =node;
			
		}
		size++;
	}
	
	public int delete()
	{
		int deleted;
		Node temp = head;
		
		for(int i=1;i<size;i++)
		{
			temp = temp.next;
			size--;
		}
		deleted = tail.value;
		tail =temp;
		return deleted;
		
	}
	

}
