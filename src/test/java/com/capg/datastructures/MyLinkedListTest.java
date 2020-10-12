package com.capg.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyLinkedListTest {
	
	@Test
	public void givenNumbers_whenAppendedToLinkedList_shouldBeAddedToBottom() {
		
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		
		boolean result = myLinkedList.head.equals(myFirstNode) && 
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myThirdNode);
		
		assertTrue(result);
	}
}
