package BST;
import java.util.*;
public class bt_to_bst {
	
	void toBst(Node root) {
		ArrayList<Integer> arr2= inorder(root);
		int arr[]=new int[arr2.size()];
		for(int i=0;i<arr2.size();i++) {
			arr[i]=arr2.get(i);
		}
		Arrays.sort(arr);
		
		for(int i=0;i<arr2.size();i++) {
		Node current=root;
		if(arr[i]==arr2.get(i)) {
			continue;
		}
		else {
			for(;;) {
				if(current.data==arr2.get(i)) {
					current.data=arr[i];
					break;
				}
				if(current.data>arr2.get(i)) {
					current=current.left;
				}
				else {
					current=current.right;
				}
			}
		}
		}
		finorder(root);
	}
	ArrayList<Integer> arr1= new ArrayList<Integer>();
	ArrayList<Integer> inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			arr1.add(root.data);
			inorder(root.right);
		}
		return arr1;
	}
	void finorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	public static void main(String args[]) {
		bt_to_bst bt1 = new bt_to_bst();
		Node root = new Node(10);
		  root.left = new Node(30); 
		    root.right = new Node(15); 
		    root.left.left = new Node(20); 
		    root.right.right = new Node(5); 
		    bt1.toBst(root);
		
	}
}
