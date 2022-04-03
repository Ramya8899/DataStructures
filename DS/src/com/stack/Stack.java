package com.stack;

import java.util.Arrays;

public class Stack {
	int arr[];
	int topofstack;
	
	
	
	public Stack(int size) {
		this.arr = new int[size];
		this.topofstack =-1;
		System.out.println("stack created");
		
		
	}

	public boolean isEmpty()
	{
		if(topofstack ==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean isfull()
	{
		if(topofstack == arr.length-1)
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
		if(isfull())
		{
			System.out.println("stack is full");
		}
		else
		{
			arr[topofstack+1] = value;
			this.topofstack++;
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			return -1;
		}
		else
		{
			int value;
			value = arr[topofstack];
			this.topofstack--;
			return value;
		}
		
		
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			return -1;
		}
		else
		{
		
			return arr[topofstack];
		}
		
		
	}
	
	public void deletestack()
	{
		arr = null;
		
	}
	
	
	
}
