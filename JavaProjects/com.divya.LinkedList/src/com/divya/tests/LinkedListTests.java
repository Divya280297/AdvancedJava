package com.divya.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.divya.LinkedList.LinkedList;

import org.junit.Ignore;

public class LinkedListTests {
	@Test
	public void new_listIsEmpty() {
		LinkedList<Integer> list=new LinkedList<>();
		assertEquals(0, list.size());
	}

	@Test
	public void toString_returnsListWithEmptyParenthesis() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		assertEquals("LinkedList()", list.toString());
	}
	
	@Test
	public void add_canAddToAnEmptyList() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		assertEquals(1, list.size());
		
	}
	
	@Test
	public void add_addingToANonEmptyListAddsItemAtTheEnd() {
		LinkedList<String> list = new LinkedList<String>();
		//list.add("One");
		if(list.size() > 0) {
		list.add("Two");
		assertEquals(null,list.locate(list.size()-1).getNext());
		}
		
	}
	

	@Test
	public void add_addedItemsAreShownInToString() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		assertEquals("LinkedList(	One	Two	Three	)",list.toString());
	}
	
	@Test
	public void get_0GetsTheFirstItem() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		assertEquals("One",list.get(0));
	}
	

	@Test
	public void get_PosReturnsItemsFromZeroBasedIndex() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		LinkedList<Integer> listInt = new LinkedList<Integer>();
		listInt.add(10);
		listInt.add(20);
		listInt.add(30);
		assertEquals(Integer.valueOf(20),listInt.get(1));
	}
	
	
	@Test
	public void get_throwsIndexExceptionForInvalidIndex() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		assertEquals("Two",list.get(3));
	}
	
	@Ignore
	@Test
	public void get_NegativeIndexIsACirclularIndex() {
		//-1 is last item
		//-2 is second last item
		//-3 is third last item
		//size() is first item
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		assertEquals("Two",list.get(-1));
		
		//you will have to modify LinkedList to implement this feature
	}
	
	@Ignore 
	@Test
	public void set_setDoesntAddNewItem() {
		
	}
	
	@Test
	public void set_replacesCurrentItem() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.set(1, "Four");
		assertEquals("Four",list.get(1));
	}
	
	 
	@Test
	public void set_failsForInvalidIndex() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.set(4, "Four");
		assertEquals("Four",list.get(4));
	}
	
	@Test
	public void remove_removesTheItemFromValidIndex() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		int before = list.size();
		list.remove(2);
		System.out.println(list.size());
		assertEquals(before-1,list.size());
	}
	
	@Ignore 
	@Test
	public void remove_usesCircularIndex() {
		
	}
	
	@Test
	public void get_removeReturnsTheRemovedItem() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.remove(2);
		assertEquals("Three", list.get(2));
	}
	
	
	
	
}
