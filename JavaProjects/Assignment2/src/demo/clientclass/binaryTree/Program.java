package demo.clientclass.binaryTree;

import com.ltts.collections.BinaryTree;
public class Program {
	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
		bt.insert(40);
		bt.insert(30);
		bt.insert(20);
		bt.insert(50);
		bt.insert(70);
		bt.insert(10);
		bt.insert(60);
		System.out.println("The inorder traversal is: ");
		bt.inorder();
		System.out.println("The preorder traversal is: ");
		bt.preorder();
		System.out.println("The postorder traversal is: ");
		bt.postorder();
	}
}
