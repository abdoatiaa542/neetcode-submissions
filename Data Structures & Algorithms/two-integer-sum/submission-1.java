class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                    int idx1 = map.get(target - nums[i]);
                    int idx2 = i;
                    return new int[]{Math.min(idx1, idx2), Math.max(idx1, idx2)};
                }
                      map.put(nums[i], i);
            
        }
        return new int[]{-1, -1};
   }
 }

