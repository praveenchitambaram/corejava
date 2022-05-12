package com.chainsys.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> stringLinkedList = new LinkedList<String>();
        stringLinkedList.add("F");
        stringLinkedList.add("B");
        stringLinkedList.add("D");
        stringLinkedList.add("E");
        stringLinkedList.add("C");
        stringLinkedList.add("F");
        stringLinkedList.add("B");
        stringLinkedList.add("D");
        stringLinkedList.add("E");
        stringLinkedList.add("C");
        stringLinkedList.addLast("Z");
        stringLinkedList.addFirst("A");
        stringLinkedList.add(1, "A2");
        Iterator<String> stringIterator=stringLinkedList.iterator();
        while(stringIterator.hasNext()) {
            System.out.print(stringIterator.next() + " ");
        }
        stringLinkedList.remove("F");
        stringLinkedList.remove(2);
        stringIterator=stringLinkedList.iterator();
        while(stringIterator.hasNext()) {
            System.out.print(stringIterator.next() + " ");
        }
        stringLinkedList.removeFirst();
        stringLinkedList.removeLast();
        stringIterator=stringLinkedList.iterator();
        while(stringIterator.hasNext()) {
            System.out.print(stringIterator.next()+ " ");
        }
    }

}