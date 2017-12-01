package com.phillippham.linked_list_with_generics;

public class LinkedList<T> // <T> Adds templating / generics
{
	// Attributes
	private Node<T> head, tail;
	
	// Constructor
	public LinkedList()
	{
		this.head = null;
		this.tail = null;
	}
	
	// Behaviors
	public boolean isEmpty()
	{
		/*if(head == null)
		{
			return true;
		}
		
		return false;*/
		
		return head == null;
	}
	
	public void addFront(T data)
	{
		// Create a Node
		Node<T> p = new Node<T>(data);
		
		// Add the Node to the chain
		if(this.head == null)
		{
			this.head = p;
			this.tail = p;
		}
		else
		{
			this.head.setPrevious(p);
			p.setNext(this.head);
			
			this.head = p;
		}
	}
	
	public void addBack(T data)
	{
		Node<T> p = new Node<T>(data);
		
		if(this.tail == null)
		{
			this.tail = p;
			this.head = p;
		}
		else
		{
			this.tail.setNext(p);
			p.setPrevious(this.tail);
			
			this.tail = p;
		}
	}
	
	public T pull()
	{
		// Get the data
		T data = this.head.getData();
		
		// Remove the head Node
		this.head = this.head.getNext();
		this.head.setPrevious(null);
		
		// Return the data that we pulled
		return data;
	}
	
	public void push(T data)
	{
		addBack(data);
	}
	
	public boolean remove(T dataToDelete)
	{
		// Delete first item if we have a match
		if(this.head.getData() == dataToDelete)
		{
			this.head = this.head.getNext();
			this.head.setPrevious(null);
			
			return true;
		}
		
		// Set flag so we know if data was found
		boolean found = false;
		
		// Look for the data on the chain
		Node<T> current = this.head;
		Node<T> target = current.getNext();
		
		while(target != null && !found)
		{
			if(target.getData() == dataToDelete)
			{
				// Flip our flag
				found = true;
				
				// Remove the Node
				target.getNext().setPrevious(current);
				current.setNext(target.getNext());
			}
			else
			{
				current = current.getNext();
				target = target.getNext();
			}
		}
		
		// Return true or false -- Did we find the data?
		return found;
	}
	
	public void display()
	{
		// Check to see if the LinkedList is empty
		if(isEmpty()) // isEmpty() == true
		{
			System.out.println("LinkedList is empty.");
			return; // Ends the method
		}
		
		// Print all of the data
		Node<T> current = this.head;
		
		while(current != null)
		{
			System.out.println(current.getData() + " ");
			current = current.getNext();
		}
		
		System.out.println();
	}
}