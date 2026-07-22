class Solution {
    public boolean isAnagram(String s, String t) {
                int sumT = 0;
        int sumS = 0;

        for (int i = 0; i < t.length(); i++) {
            sumT += t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {

            sumS += s.charAt(i);
        }

        return sumS == sumT ? true : false;
    }
}