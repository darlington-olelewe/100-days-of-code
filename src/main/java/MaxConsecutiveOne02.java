public class MaxConsecutiveOne02 {
  public int findMaxConsecutiveOnes(int[] nums) {

    int count = 0;
    int max = 0;

    for(int i = 0; i < nums.length; i++){
      if(nums[i] == 1){
        count++;
      }else if(nums[i] == 0){

        max = Math.max(max, count);
        count = 0;
      }
    }

    if(nums[nums.length - 1] == 1){
      max = Math.max(max, count);
    }

    return max;
  }
}
