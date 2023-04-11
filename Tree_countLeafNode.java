public class Solution {

	public static boolean isLeaf(TreeNode<Integer> root){
		if(root.children.size() == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
		if(root == null){
			return 0;
		}

		if(isLeaf(root)){
			return 1;
		}

		int count = 0;
		for(int i = 0; i< root.children.size(); i++){
			if(isLeaf(root.children.get(i))){
				count+= 1;
			}
			else{
				count += countLeafNodes(root.children.get(i));
			}
		}

		return count;
	}
	
}
