class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            int flag = 0;
            for (int j = i; j < i + k - 1; j++) {
                if (nums[j + 1] - nums[j] != 1){
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                res[i] = -1;
            else
                res[i] = nums[i + k - 1];
        }
        return res;
    }
}