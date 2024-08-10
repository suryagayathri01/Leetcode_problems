class Solution {
    public int findMaxLength(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeroes = 0, ones = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeroes++;
                } else {
                    ones++;
                }
                if (zeroes == ones) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}