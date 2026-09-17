class Solution {
    public static int maxArea(int[] heights) {
        int maxRes = 0;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            int mix = Math.min(heights[left], heights[right]) * (right - left);
            maxRes = Math.max(mix, maxRes);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxRes;
    }
}
