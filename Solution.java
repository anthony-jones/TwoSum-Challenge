class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int c = i + 1; c <nums.length; c++){
                if(target == nums[i] + nums[c]){
                    return new int[] { i, c};
                }
            }
        }
        throw new IllegalArgumentException("NO SOLUTION EXISTS");
    }
}
