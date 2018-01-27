package com.ex.ds;

import java.util.NoSuchElementException;

class Node {
	private int data;
	private Node link;

	Node() {

	}

	Node(int data, Node link) {
		this.data = data;
		this.link = link;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
}

class Dequeue {

	Node front, rear;
	int size = 0;

	/* Constructor */
	public Dequeue() {
		front = null;
		rear = null;
		size = 0;
	}

	/* Function to check if queue is empty */
	public boolean isEmpty() {
		return front == null;
	}

	/* Function to get the size of the queue */
	public int getSize() {
		return size;
	}

	/* Clear dequeue */
	public void clear() {
		front = null;
		rear = null;
		size = 0;
	}

	public void insertAtFront(int data) {

		Node nptr = new Node(data, null);
		size++;
		if (front == null) {
			front = nptr;
			rear = front;
		} else {
			nptr.setLink(front);
			front = nptr;
		}

	}

	public void insertAtRear(int data) {

		Node nptr = new Node(data, null);
		size++;
		if (rear == null) {
			rear = nptr;
			front = rear;
		} else {
			rear.setLink(nptr);
			rear = nptr;
		}
	}
	
	public void removetAtFront() {
		Node nptr = front.getLink();
		front = nptr;
		size--;
	}
	
	public int removetAtRear() {
		if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        int ele = rear.getData();
        Node s = front;
        Node t = front;
        while (s != rear)
        {
            t = s;
            s = s.getLink();
        }
        rear = t;
        rear.setLink(null);
        size --;
 
        return ele;
	}

}

public class DequeueExample {

	public static void main(String[] args) {

	}

}
