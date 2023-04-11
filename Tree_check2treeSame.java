public class Solution {

	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
		if(root1 == null && root2 == null){
			return true;
		}

		if(root1.data != root2.data || root1.children.size() != root2.children.size()){
			return false;
		}

		boolean ans = true;

		for(int i = 0; i<root1.children.size() ; i++){

			if(root1.children.get(i).data != root2.children.get(i).data){
				return false;
			}

			ans = ans && checkIdentical(root1.children.get(i), root2.children.get(i));

		}
		return ans;
	}
	
}
