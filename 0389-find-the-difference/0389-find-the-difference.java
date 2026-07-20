class Solution {
   public char findTheDifference(String s, String t) {
        int sumT = 0;
        int sumS = 0;
        int diff = 0;

        for (int i = 0; i < t.length(); i++) {
            sumT += t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {

            sumS += s.charAt(i);
        }
        diff = sumT - sumS;
        return (char) diff;
    }
}