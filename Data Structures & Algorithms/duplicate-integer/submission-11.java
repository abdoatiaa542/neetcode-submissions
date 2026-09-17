class Solution {
    public Boolean hasDuplicate(int[] arr) {
        // Step 1: Find min and max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Step 2: Create frequency array for [min..max]
        int[] freq = new int[max - min + 1];

        // Step 3: Fill frequency array
        for (int num : arr) {
            int idx = num - min; // shift so min → 0
            freq[idx]++;
            if (freq[idx] > 1) {
                return true;
            }
        }

        return false;
    }
}
