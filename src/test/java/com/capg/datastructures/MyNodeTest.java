package com.capg.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyNodeTest 
{
    /**
     * UC1 creating linked list
     * follow test driven approach
     */
    @Test
    public void givenThreeNumbers_whenLinked_shouldPassLinkedListTest()
    {
    	MyNode<Integer> myFirstNode = new MyNode<>(56);
    	MyNode<Integer> mySecondNode = new MyNode<>(30);
    	MyNode<Integer> myThirdNode = new MyNode<>(70);
    	
    	myFirstNode.setNext(mySecondNode); //56 pointing to 30
    	mySecondNode.setNext(myThirdNode); //30 pointing to 70
    	
    	boolean result = myFirstNode.getNext().equals(mySecondNode) &&
    				     mySecondNode.getNext().equals(myThirdNode);	
        assertTrue(result);
    }
}
