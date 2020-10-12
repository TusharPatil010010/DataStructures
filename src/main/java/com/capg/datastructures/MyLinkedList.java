package com.capg.datastructures;

public class MyLinkedList {

	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * UC2 Adding elements in a Linked List
	 * 
	 * @param newNode
	 */
	public void add(INode newNode) {

		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	/**
	 * UC3 Appending elements in a Linked List
	 * 
	 * @param newNode
	 */
	public void append(INode newNode) {

		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	/**
	 * UC4 Inserting elements between two nodes
	 * 
	 * @param myNode
	 * @param newNode
	 */
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	/**
	 * UC5 Deleting the first element from a linked list
	 * 
	 * @return
	 */
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	/**
	 * UC6 Deleting the last element
	 * 
	 * @return
	 */
	public INode poplast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	/**
	 * UC7 Searching the required node
	 * 
	 * @param searchNode
	 */

	public void searchNode(INode searchNode) {
		INode tempNode = head;
		while (!tempNode.equals(tail)) {
			if (tempNode.getKey() == searchNode.getKey()) {
				System.out.println("Node found " + searchNode.getKey());
				return;
			}
			tempNode = tempNode.getNext();
		}
	}

	/**
	 * UC8 Inserting the element at desired position
	 * 
	 * @param myNode
	 * @param newNode
	 */
	public void insertNode(INode myNode, INode newNode) {
		INode tempNode = head;
		while (!tempNode.getNext().equals(myNode)) {
			tempNode = tempNode.getNext();
		}
		tempNode = tempNode.getNext().getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		System.out.println(myNode.getKey());
		System.out.println(newNode.getKey());
		System.out.println(newNode.getNext().getKey());
	}
}
