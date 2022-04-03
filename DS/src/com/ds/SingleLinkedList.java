package com.ds;

public class SingleLinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	
	public Node createsinglelist(int value)
	{
		head = new Node();
		Node node = new Node();
		node.value = value;
		node.next = null;
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	
	public void insertToLinkedList(int value,int loc)
	{
		Node node = new Node();
		node.value=value;
		if(head == null)
		{
			createsinglelist(value);
			return;
		}
		else if(loc == 0)
		{
			node.next = head;
			head = node;
		}
		else if(loc >= size)
		{
			node.next = null;
			tail.next = node;
			tail =node;
		}
		else
		{
			Node tempNode = head;
			int index = 0;
			while(index > loc-1)
			{
				tempNode = tempNode.next;
				index++;
			}
			
			node.next = tempNode.next;
			tempNode.next = node;
		}
		size++;
		
		
		
		
		
	}
	
	public void traverseSingleListedList()
	{
		if(head == null)
		{
			System.out.println("singleLinkedList dnt exist");
		}
		else
		{
			Node tempNode = head;
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
	
	public boolean searchForNode(int nodeval)
	{
		if(head != null)
		{
			Node temp = head;
			for(int i=0;i<size;i++)
			{
				if(nodeval == temp.value)
				{
					return true;
				}
				temp = temp.next;
				
			}
		}
		return false;
	}
	
	public void deleteNode(int loc)
	{
		if(head == null)
		{
			return;
		}
		
	    else if(loc ==0)
		{
			head = head.next;
			size--;
			if(size == 0)
			{
				tail = null;
			}
		}
		else if(loc-1 >= size)
		{
			
			Node temp = head;
			for(int i=0;i<size;i++)
			{
				
				
				if(i==size-2)
				{
					temp.next = null;
					tail = temp;
					return;
				}
				temp = temp.next;
			}
			if(temp==head)
			{
				head = tail = null;
			}
			
			size--;
		}
		else if(loc<size)
		{
			Node temp = head;
			for(int i=0;i<loc-1;i++)
			{
				
				temp = temp.next;
				
				
			}
			temp.next= temp.next.next;
			
			size--;
		}
		
		
		
	}
	
	
	public void deleteLinkedlist()
	{
		head = null;
		tail = null;
	}
	

}
