
class Solution {
  public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int duplicate = -1;
        int missing = -1;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                duplicate = nums[i];
            } else {
                map.put(nums[i], i);
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}