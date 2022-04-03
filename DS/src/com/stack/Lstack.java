package com.stack;

public class Lstack {
	Linkedlist ll ;
	

	public Lstack() {
		 ll = new Linkedlist();
	}

	
	
	public boolean isEmpty()
	{
		if(ll.head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void push(int value)
	{
		ll.insertSSDL(value);
	}
	public void transeverse()
	{
		ll.transverse();
	}
	public int pop()
	{
		return ll.delete();
		
	}
	public int peek()
	{
		
		return ll.tail.value;
	}
	
	
}
