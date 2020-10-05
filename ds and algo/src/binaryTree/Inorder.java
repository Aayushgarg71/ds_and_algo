package binaryTree;
import java.util.*;
public class Inorder {
	void inorder(Node root) {
		if(root==null) {
			return ;
			
		}
		else {
			Stack <Node> q = new Stack<Node>();
			Node curr=root;
			//q.push(curr);
			while(curr!=null||q.size()>0) {
				while(curr!=null){
					
					q.push(curr);
					curr=curr.left;
				}
				 curr=q.pop();
				 System.out.println(curr.data);
				curr=curr.right;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Node root=new Node(10);
		Node root = new Node();
		Insert i = new Insert();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of nodes");
		int s= sc.nextInt();
		for(int l=0;l<s;l++) {
			i.insert(root, sc.nextInt());
		}
		Inorder in = new Inorder();
		in.inorder(root);
	}

}
