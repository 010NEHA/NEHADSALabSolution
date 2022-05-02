package Quest2;

import java.util.HashSet;
import java.util.Set;

public class FindSumPair {

	private Node root;
	private Set<Integer> set = new HashSet<Integer>();
	
	FindSumPair() {
		this.root = null;
	}
	
	public void insert(int data) {
		this.root = insert(this.root, data);
	}

	private Node insert(Node node, int data) {
		
		if(node == null) {
			Node newnode = new Node(data);
			return newnode;
		}
		
		if(data < node.data)
			node.left = insert(node.left, data);
		else if(data > node.data)
			node.right = insert(node.right, data);
		
		return node;
	}
	
	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		
		// base case
		if(node == null)
			return;
		
		// print self
		String leftChild, rightChild;
		
		if(node.left == null)
			leftChild = "X";
		else
			leftChild = node.left.data + "";
		
		if(node.right == null)
			rightChild = "X";
		else
			rightChild = node.right.data + "";
		
		System.out.println(leftChild +  " <- " + node.data + " -> " + rightChild);
		
		display(node.left);
		display(node.right);
		
	}
	
	public void findSumPair(int sum) {
		boolean flag = false;
		flag = findSumPair(this.root, sum, set, flag);
		if(!flag)
			System.out.println("not found");
	}

	private boolean findSumPair(Node node, int sum, Set<Integer> set, boolean flag) {
		
		if(node == null)
			return flag;
		
		int comp  = sum - node.data;
		if(set.contains(comp)) {
			System.out.println("Pair : (" + node.data + ", " + comp + ")");
			return true;
		} else {
			set.add(node.data);
			flag = findSumPair(node.left, sum, set, flag);
			flag = findSumPair(node.right, sum, set, flag);
		}
		
		return flag;
		
	}
	
}
