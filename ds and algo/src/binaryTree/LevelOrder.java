package binaryTree;
import java.util.*;
public class LevelOrder {
 void levelOrder(Node root) {
	 if(root==null) {
		 return;
	 }
	 else {
		 Queue <Node> q = new LinkedList<Node>();
		 Queue <Node> q1=new LinkedList<Node>();
		 q1.add(root);
		 while(!q1.isEmpty()) {
			 while(!q1.isEmpty()) {
				 q.add(q1.poll());
			 }
		 while(!q.isEmpty()) {
			 Node temp=q.peek();
			 q.remove();
			 System.out.print(temp.data+" ");
			 if(temp.left!=null) {
				 q1.add(temp.left);
			 }
			 if(temp.right!=null) {
				 q1.add(temp.right);
			 }
		 }
		 System.out.println();
		 }
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		Insert i = new Insert();
		i.insert(root,20);
		i.insert(root,30);
		i.insert(root,24);
		LevelOrder l = new LevelOrder();
		l.levelOrder(root);
	}

}
