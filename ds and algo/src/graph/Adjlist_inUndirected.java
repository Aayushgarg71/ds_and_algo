package graph;
import java.util.*;
public class Adjlist_inUndirected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no.of nodes");
	public int a= sc.nextInt();
	LinkedList obj[]= new LinkedList[a];
	for(int i=0;i<a;i++) {
		obj[i]=new LinkedList();
	}
	
	while(true) {
		int temp=sc.nextInt();
		int temp1=sc.nextInt();
		obj[temp].add(temp1);
		obj[temp1].add(temp);
		System.out.println("Add more ?");
		char c=sc.next().charAt(0);
		if(c=='y') {
			continue;
		}
		else {
			break;
		}
	}
	for(int i=0;i<a;i++) {
		System.out.println(obj[i]);
	}
	}

}
