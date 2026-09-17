class Solution {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int result = 1, temp = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {continue;}
            if (nums[i] - nums[i - 1] ==  1){ temp++;} else {temp = 1;}
            result = Math.max(result, temp);
        }
        return result;
    }

}
