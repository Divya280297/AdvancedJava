package com.ltts.collections;

public class BinaryTree {

class BinaryNode{
int value;
BinaryNode left;
BinaryNode right;
public BinaryNode(int val) {
value = val;
left = right = null;
}
};

BinaryNode root = null;
public void insert(int val) {
root = insertNode(root,val);
}
public BinaryNode insertNode(BinaryNode root1, int val) {
//System.out.print(val);
if(root1 == null) {
root1 = new BinaryNode(val);
return root1;
}

if(val < root1.value) {
root1.left = insertNode(root1.left,val);
//System.out.println(root1.value);

}
else if(val>root1.value) {
root1.right = insertNode(root1.right,val);
//System.out.println(root1.value);
}

return root1;
}

public void inorderRec(BinaryNode root1) {
if (root1 != null) {
inorderRec(root1.left);
            System.out.println(root1.value);
            inorderRec(root1.right);
        }
}
public void preorderRec(BinaryNode root) {
if(root != null) {
System.out.println(root.value);
preorderRec(root.left);
preorderRec(root.right);
}
}
public void postorderRec(BinaryNode root) {
if(root != null) {
postorderRec(root.left);
postorderRec(root.right);
System.out.println(root.value);
}
}
public void inorder() {
inorderRec(root);
}
public void preorder() {
preorderRec(root);
}
public void postorder() {
postorderRec(root);
}

}
