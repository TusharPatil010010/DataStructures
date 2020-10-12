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
		String value = myLinkedList.searchNode(mySecondNode);

		assertEquals("Node found", value);
	}
}
