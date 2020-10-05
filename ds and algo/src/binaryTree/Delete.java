package binaryTree;
import java.util.*;
public class Delete {
	void delete(Node root,int t) {
		if(t==root.data) {
			root=null;
			return;
		}
		else {
		Node curr=root;
		Node pre =root;
		while(curr.right!=null) {
			pre =curr;
			curr=curr.right;
		}
		Node curr1=root;
		Queue <Node> q= new LinkedList<Node>();
		q.add(curr1);
		while(!q.isEmpty()) {
			curr1=q.peek();
			q.remove();
			if(curr1.left.data==t) {
				curr1.left.data=curr.data;
				break;
			}
			else {
				q.add(curr1.left);
			}
			if(curr.right.data==t) {
				curr1.right.data=curr.data;
				break;
			}
			else {
				q.add(curr1.right);
			}
		}
		pre.right=null;
		//System.out.println(root.data);
	}
		//System.out.println(root.data);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		Insert i = new Insert();
		i.insert(root,20);
		i.insert(root,30);
		i.insert(root,24);
		i.display(root);
		System.out.println();
		Delete d= new Delete();
		d.delete(root, 20);
		i.display(root);
		d.delete(root, 30);
		System.out.println();
		i.display(root);
	}

}
