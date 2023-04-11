class Container{
	TreeNode<Integer> node;
	int sum;
}

public class Solution {

	public static Container helper(TreeNode<Integer> root){
		int sum = root.data;
		for(int i = 0; i< root.children.size(); i++){
			sum += root.children.get(i).data;
		}

		Container currentNode = new Container();
		currentNode.node = root;
		currentNode.sum = sum;
		int max = currentNode.sum;


		Container child;
		Container ans = currentNode;

		for(int i = 0; i<root.children.size(); i++){
			child = helper(root.children.get(i));
			max = Math.max(max,child.sum);
			if(max == child.sum){
				ans = child;
			}
		}
		return ans;

	}
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
		if(root == null){
			return null;
		}

		Container result = helper(root);

		return result.node;
	}
	
}
