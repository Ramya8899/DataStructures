package com.ds;

public class CircularLinkedList {
	public Node head;
	public Node tail;
	public int size;
	public Node createCircleLinkedList(int nodeval)
	{
		Node node = new Node();
		node.value = nodeval;
		head = node;
		node.next = node;
		tail = node;
		size++;
		
		return node;
		
	}
	
	public void insterAtBeginning(int value,int loc)
	{
		Node tempnode = head;
		Node node = new Node();
		node.value = value;
		if(head == null)
		{
			createCircleLinkedList(value);
			return;
		}
		else if(loc == 0)
		{
			node.next = head;
			head = node;
			tail.next = head;
			size++;
			
		}
		else if(loc >= size)
		{
			
			tail.next = node;
			tail = node;
			tail.next = head;
			size++;
			
		}
		else
		{
			for(int i=0;i<loc;i++)
			{
				tempnode = tempnode.next;
			}
			node.next = tempnode.next;
			tempnode.next = node;
			size++;
			
		}
	}
	
	public void traverseCircleListedList()
	{
		if(head == null)
		{
			System.out.println("singleLinkedList dnt exist");
		}
		else
		{
			Node tempNode = head;
			for(int i =0;i<size+10;i++)
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
	
	public boolean searchInCircleLinkedList(int val)
	{
		if(head==null)
		{
			return false;
		}
		else
		{
			Node temp = head;
			for(int i=0;i<size;i++)
			{
				if(temp.value == val)
				{
					return true;
				}
				temp = temp.next;
			}
			
		}
		return false;
	}
	
	public void deleteNode(int node)
	{
		if(head==null)
		{
			return;
		}
		else if(node == 0)
		{
			head = head.next;
			tail.next = head;
			size--;
		}
		else if(node >= size-1)
		{
			Node temp = head;
			for(int i=0;i<size-2;i++)
			{
				temp = temp.next;
			}
			if(temp==head)
			{
				head = null;
				tail = null;
				size--;
				return;
			}
			temp.next = head;
			tail = temp;
			size--;
			
		}
		else
		{
			Node temp = head;
			for(int i=0;i<node-1;i++)
			{
				temp = temp.next;
			}
			
			temp.next= temp.next.next;
			size--;
		}
	}

}
