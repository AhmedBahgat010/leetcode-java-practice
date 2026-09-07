class Solution {
    public int arraySign(int[] nums) {
     if (nums == null || nums.length == 0) {
            return 0;
        }
        int sign = 1;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                sign *= -1;
            } else {
                sign *= 1;
            }
        }
     return sign ;


}}