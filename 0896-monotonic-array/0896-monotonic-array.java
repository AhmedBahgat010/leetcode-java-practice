class Solution {

    public boolean isMonotonic(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return true;
        }
        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i] <= nums[i + 1]) {
                increasing = true;
            }
            if (nums[i] >= nums[i + 1]) {
                decreasing = true;
            }
        }
        return increasing && decreasing ? false : true;
    }
}