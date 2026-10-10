
class Solution {
   public int[] findErrorNums(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        // [1,2,2,4]
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,  0) + 1);
        }

        int dup = 0;
        int mis = 0;
        for (int i = 1; i <= nums.length; i++) {
            int count = map.getOrDefault(i, 0);
            if (count == 2) dup = i;
            if (count == 0) mis = i;

        }
        return new int[]{dup, mis};
    
}
}