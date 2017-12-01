package com.phillippham.linked_list_with_generics;

public class Node<T> // <T> Adds template
{
	// Attributes
	private T data; // Data stored on the Node<T>
	private Node<T> next, previous; // Link to next and previous Node<T> on the chain
	
	// Constructors
	public Node()
	{
		this.data = null;
		this.next = null;
		this.previous = null;
	}
	
	public Node(T data)
	{
		this.data = data;
		this.next = null;
		this.previous = null;
	}

	// Accessors
	public T getData()
	{
		return data;
	}

	public Node<T> getNext()
	{
		return next;
	}

	public Node<T> getPrevious()
	{
		return previous;
	}
	
	// Mutators
	public void setData(T data)
	{
		this.data = data;
	}

	public void setNext(Node<T> next)
	{
		this.next = next;
	}

	public void setPrevious(Node<T> previous)
	{
		this.previous = previous;
	}
}