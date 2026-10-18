
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> allSum =  new ArrayList<>();
        int  sum = 0;

        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int n :accounts[i] ){
                sum+=n;
            }
                allSum.add(sum);
        }
        Collections.sort(allSum);
        return allSum.getLast();
    }
}