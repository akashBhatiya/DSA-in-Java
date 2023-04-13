import java.util.HashMap;
public class Solution {

  public static int maxFrequencyNumber(int[] arr){ 

    HashMap<Integer, Integer> map=new HashMap<>();

    int max = 0;
    int maxKey = Integer.MIN_VALUE;

    for(int i = 0; i< arr.length; i++){
      int temp;
      if(map.containsKey(arr[i])){
        map.put(arr[i],map.get(arr[i]) +1);
        temp = map.get(arr[i]);

      }
      else{
        map.put(arr[i],1);
        temp = 1;
      }

    }

    for(int i = 0; i<arr.length; i++){
      if(map.get(arr[i])>max){
        max=map.get(arr[i]);
        maxKey=arr[i];
      }
    }

    return maxKey;

    
  }

}
