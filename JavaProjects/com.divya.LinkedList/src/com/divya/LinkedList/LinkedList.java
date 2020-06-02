package com.divya.LinkedList;


public class LinkedList<X> {  	
	public class Node {	
		X value;
		private Node next;
		Node previous;
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
	Node first;
	int count;
	Node last; //always remember the last position.
	public void add(X value) {
	
		Node newNode=new Node();
		newNode.value=value;
		newNode.setNext(null); //remember this will be the last node.
		newNode.previous=last; //current last node is my previous
		
		count++;
		if(first==null) 
			first=newNode; //this node is the first node
		else
			last.setNext(newNode); //next to current last will be newNode
		
		last=newNode; //new node is the last Node
			
		
	}
	
	public void insert(int pos, X value) {
		
		Node n=locate(pos);
		
		if(n==null)
			return ; //there is no node. can't insert
		
		Node newNode=new Node();
		newNode.value=value;
		newNode.setNext(n); //remember we are inserting before n
		newNode.previous=n.previous; //what ever comes before n
		
		if (n==first) //inserting before first
			first=newNode;
		else
			n.previous.setNext(newNode);
		
		n.previous=newNode;
		count++;
	}
	
	public Node locate(int pos) {
		
		if(pos<0 || pos>=size())
			throw new IndexOutOfBoundsException(pos);
		
		int i=0;
		Node n=first;
		while(i<pos)
		{
			i++;
			n=n.getNext();
		}
		return n;
	}
	
	public X get(int pos) {
		Node n = locate(pos);
		if(n==null)
			return null;
		else
			return n.value;
	}
	
	public void set(int pos, X value) {
		Node n = locate(pos);
		if(n!=null)
			n.value=value;
	}
	
	public void remove(int pos) {
		
		if(pos<0)
			return ; //nothing to remove
		
		if(first==null) //list is empty
			return ; //nothing to remove
		
		
		Node n=locate(pos);
		
		if(n==null)
			return ; //we moved past the last one. Nothing to remove
		
		if(n.previous==null)   //deleting first node
			first=n.getNext();
		else
			n.previous.setNext(n.getNext()); //if not the first node
		
		if(n.getNext()!=null) // last node			
			n.getNext().previous=n.previous; //not the last node
		count--;
		
	}
	
	public int size() {
		return count;
	}
	
	public  static <T> LinkedList<T> create(T...values){
		LinkedList<T> list=new LinkedList<T>();
		for(T value : values) {
			list.add(value);
		}
		
		return list;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(size()==0)
			return "LinkedList()";
		
		String str="LinkedList(\t";
		
		for(Node n=first;n!=null;n=n.getNext())
			str+=n.value+"\t";
		
		str+=")";
		
		return str;
	}
		
}
