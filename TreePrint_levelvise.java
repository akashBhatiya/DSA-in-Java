import java.util.Queue;
import java.util.LinkedList;
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		
		if(root == null){
			return;
		}

		Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();

		q.add(root);
		q.add(null);

		while(!q.isEmpty()){
			
			TreeNode<Integer> temp = q.poll();
			

			if(temp == null){
				System.out.println();
				if(!q.isEmpty()){
					q.add(null);
				}
			}
			if(temp != null){
				System.out.print(temp.data + " ");
				for(int i = 0 ; i<temp.children.size(); i++){
					q.add(temp.children.get(i));
				}
			}

		}

	}
		
}
