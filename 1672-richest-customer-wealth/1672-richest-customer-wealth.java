
class Solution {
    public int maximumWealth(int[][] accounts) {
        int  sum = 0;
        int maxSum = 0;

        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int n :accounts[i] ){
                sum+=n;
            }
            if(sum> maxSum ){
                maxSum=  sum;
            }
        }
        return maxSum;
    }
}