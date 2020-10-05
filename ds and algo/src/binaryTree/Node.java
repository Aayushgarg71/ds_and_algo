package binaryTree;
import java.util.*;
public class Node {
	int data;
	Node left,right;
public Node(int d) {
	data=d;
	left=null;
	right=null;
}
Node(){
	Scanner sc = new Scanner(System.in);
	data=sc.nextInt();
	left=right=null;
}
}
