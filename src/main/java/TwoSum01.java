import java.util.HashMap;
import java.util.Map;

public class TwoSum01 {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
      int x = target - nums[i];
      if(map.containsKey(nums[i])){
        return new int[]{i, map.get(nums[i])};
      }else{
        map.put(x, i);
      }
    }
    return new int[2];
  }
}
