import java.util.*;
public class Solution {

	public static int numNodeGreater(TreeNode<Integer> root,int x){
	
		if(root == null) {
			return 0;
		}

	
		int count = 0;
		
		Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();

		q.add(root);
		q.add(null);

		while(!q.isEmpty()){
			
			TreeNode<Integer> temp = q.poll();
			

			if(temp == null){
				
				if(!q.isEmpty()){
					q.add(null);
				}
			}
			if(temp != null){
				if(temp.data > x){
					count++;
				}
				for(int i = 0 ; i<temp.children.size(); i++){
					q.add(temp.children.get(i));
				}
			}

		}


		return count;
		

	}
	
}
