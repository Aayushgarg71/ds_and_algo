package binaryTree;
import java.util.*;
public class Insert {
	
void insert(Node root,int d) {
	if(root==null) {
		root=new Node(d);
	}
	else {
		Queue <Node> q= new LinkedList<Node>();
		q.add(root);
		while(q.size()>0) {
			Node temp= q.poll();
			if(temp.left==null) {
				temp.left= new Node(d);
				break;
			}
			else {
				q.add(temp.left);
			}
			if(temp.right==null) {
				temp.right=new Node(d);
				break;
			}
			else {
				q.add(temp.right);
			}
		}
	}
	
}
void display(Node root) {
	if(root!=null) {
		display(root.left);
		System.out.print(root.data+" ");
		display(root.right);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		Insert i = new Insert();
		i.insert(root,20);
		i.insert(root,30);
		i.insert(root,24);
		i.display(root);
	}

}
