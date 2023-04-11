import java.util.ArrayList;

public class Solution {


	public static void helper(TreeNode<Integer> root, ArrayList<TreeNode<Integer>> arr){

		if(root.data > arr.get(0).data && root.data > arr.get(1).data){
			arr.set(0,arr.get(1));
			arr.set(1, root);
		}
		else if(root.data > arr.get(0).data && root.data <arr.get(1).data){
			arr.set(0,root);
		}

		for(int i = 0 ; i<root.children.size(); i++){
			helper(root.children.get(i), arr);
		}

	}
		
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		
		if(root == null){
			return null;
		}

		ArrayList<TreeNode<Integer>> arr = new ArrayList<TreeNode<Integer>>();
		TreeNode<Integer> temp = new TreeNode<Integer>(Integer.MIN_VALUE);
		arr.add(temp);
		arr.add(temp);

		helper(root, arr);

		return arr.get(0);

	}
	
	
}
