class Solution {
    public void moveZeroes(int[] nums) {
    for (int pass = 0; pass < nums.length; pass++) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[i + 1];
                nums[i + 1] = 0;
            }
        }
    }
    }
}