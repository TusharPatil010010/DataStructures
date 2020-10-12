package com.capg.datastructures;

import static org.junit.Assert.assertEquals;
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

		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
						 && myLinkedList.tail.equals(myThirdNode);

		assertTrue(result);
	}

	@Test
	public void givenNumbers_whenInsertedToLinkedList_shouldBeInsertedAtRequiredPosition() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);// Inserting second node between first and third

		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
						 && myLinkedList.tail.equals(myThirdNode);

		assertTrue(result);
	}

	@Test
	public void givenNumbers_whenDeletedFirstNodeFromLinkedList_shouldChangeHeadToTheNextPosition() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.pop();

		boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);

		assertTrue(result);
	}

	@Test
	public void givenNumbers_whenDeletedLastFromLinkedList_shouldChangeTailToThePreviousPosition() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.poplast();

		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.tail.equals(mySecondNode);

		assertTrue(result);
	}

	@Test
	public void givenNumbers_whenSearchedFromLinkedList_shouldReturnSearchedPosition() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.searchNode(mySecondNode);
		
		boolean result = mySecondNode.getKey() == 30;
		assertTrue(result);
	}
	
	@Test
	public void givenNumbers_whenInsertingInLinkedList_shouldBeInsertedAtGivenPosition() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myInsertingNode = new MyNode<>(40);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		
		myLinkedList.insertNode(mySecondNode,myInsertingNode);
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				 		 && myLinkedList.head.getNext().getNext().equals(myInsertingNode) && myLinkedList.tail.equals(myThirdNode);
		assertTrue(result);
	}	
	
	@Test
	public void givenNumbers_whenDeletingFromLinkedList_shouldBeDeletedFromGivenPosition() {
		
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> mydeletingNode = new MyNode<>(40);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(mydeletingNode);
		myLinkedList.append(myThirdNode);
		
		myLinkedList.deleteNode(mydeletingNode);
		myLinkedList.size();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
						 && myLinkedList.tail.equals(myThirdNode);
		assertTrue(result);
	}	
}
