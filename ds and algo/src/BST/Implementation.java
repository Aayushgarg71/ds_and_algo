package BST;
import java.util.*;
 class Node{
	Node left;
	Node right;
	int data;
	public Node(int a){
	data=a;
	left=null;
	right=null;
	}
}
public class Implementation {
	
	static Node root=null;
	static void insert(int a) {
		root=insert1(a,root);
	}
	static Node insert1(int a,Node root) {
	if(root==null) {
		Node temp = new Node(a);
		root= temp;
		
	}
	else {
		if(a<root.data) {
			
			root.left=insert1(a,root.left);
		}
		if(a>root.data) {
			
			root.right=insert1(a,root.right);
		}
	}
	return root;
}
	static void inorder() {
		
		inorder1(root);
	}
	static void inorder1(Node root1) {
		
		if(root1!=null) {
			inorder1(root1.left);
			System.out.print(root1.data);
			inorder1(root1.right);
		}
	}
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1) to insert  2)delete   3)search  5)break");
	for(;;) {
		int a=sc.nextInt();
		if(a==1) {
			insert(sc.nextInt());
		}
		if(a==2) {
			//delete(sc.nextInt());
		}
		if(a==3) {
			//search(sc.nextInt());
			
		}
		if(a==4) {
			inorder();
		}
		if(a==5) {
			break;
		}
	}
	}
}
