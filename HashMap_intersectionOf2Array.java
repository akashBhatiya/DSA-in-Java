import java.util.HashMap;
public class Solution {

	public static void printIntersection(int[] arr1,int[] arr2){
	
		
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0;  i< arr1.length; i++){
			if(map.containsKey(arr1[i])){
				map.put(arr1[i],map.get(arr1[i]) +1);
			}
			else{
				map.put(arr1[i],1);
			}
		}

		for(int i = 0; i<arr2.length; i++){
			if(map.containsKey(arr2[i])){
				if(map.get(arr2[i]) > 0){
					map.put(arr2[i], map.get(arr2[i]) - 1);
					System.out.println(arr2[i]);
				}
			}
		}

	}
}
