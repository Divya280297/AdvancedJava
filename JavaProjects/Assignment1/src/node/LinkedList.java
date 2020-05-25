package node;

public class LinkedList {

	Node first;
	Node last;
	public void addNode(int val) {
		Node newNode = new Node();
		newNode.value = val;
		newNode.next = null;
		if(first == null) {
			first=newNode;
			newNode.prev = null;
			return;
		}
		
		Node n = first;
		while(n.next != null)
		{
				n = n.next;
		}
		
		last = n;
		last.next = newNode;
		newNode.prev = last;
		
	}
	public void insert(int val, int pos) {
		Node newNode = new Node();
		newNode.value=val;
		newNode.next=null;
		Node node = first;
		int i = 0;
		while(i < pos) {
			node=node.next;
			i++;
		}
		if(pos == 0) {
			newNode.next = first.next;
			first = newNode;
			newNode.prev = null;
			return;
		}
		Node prev = node;
		newNode.next=prev.next;
		prev.next=newNode;
		newNode.prev=prev;
		prev.next.prev = newNode;
	}
	public int get(int pos) {
		int i = 0;
		Node node = first;
		while(i<pos) {
			node = node.next;
			i++;
		}
		return node.value;
	}
	public void set(int pos, int val)
	{
		int i = 0;
		Node node = first;
		while(i<pos) {
			node = node.next;
			i++;
		}
		node.value = val;
	}
	public void remove(int pos) {
		
		int i = 0;
		Node node = first;
		while(i<pos) {
			node = node.next;
			i++;
		}
		
		if(node == first)
		{
			first = first.next;
			return;
		}
		Node del = node;
		if(del.next != null) {
			del.next.prev = del.prev;
		}
		
		if(del.prev !=null) {
			del.prev.next=del.next;
		}
		//return;
	}
	public int size() {
		int i = 0;
		Node node = first;
		while(node.next != null) {
			node = node.next;
			i++;
		}
		return i+1;
	}
	public void display() {
		Node n =first;
		while(n.next != null) {
			System.out.println(n.value);
			n = n.next;
		}
		System.out.println(n.value);
	}
	public static void main(String args[]) {
		LinkedList l = new LinkedList();
		l.addNode(1);
		l.addNode(2);
		l.addNode(3);
		l.display();
		l.insert(5,1);
		l.display();
		l.remove(2);
		l.display();
	}
}
