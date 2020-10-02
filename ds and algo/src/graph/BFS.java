package graph;
import java.util.*;
public class BFS {
	public static ArrayList<ArrayList<Integer>> arr;
	BFS(){
		arr= new ArrayList<ArrayList<Integer>>();
	}
	static void insert(int t,int u){
		arr.get(t).add(u);
		arr.get(u).add(t);
	}
	static void display() {
		Iterator <ArrayList<Integer>> i = arr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of node");
		int a= sc.nextInt();
		insert(0,1);
		insert(2,3);
		insert(4,1);
		insert(1,5);
		insert(7,2);
		insert(4,2);
		display();
//		System.out.println("Enter the node to start of BFS");
//		int w=sc.nextInt();
//		Queue<Integer> q= new LinkedList();
//		//boolean arr[]=new boolean[adj.a];
//		q.add(w);
//		while(!q.isEmpty()) {
//			int t;
//		}
	}

}
