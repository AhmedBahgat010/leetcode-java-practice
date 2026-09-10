class Solution {
  public int romanToInt(String s) {
    final Map<Character, Integer> roman = new HashMap<>();

    roman.put('I', 1);
    roman.put('V', 5);
    roman.put('X', 10);
    roman.put('L', 50);
    roman.put('C', 100);
    roman.put('D', 500);
    roman.put('M', 1000);

    int sum = 0;
    int oldNum = 0;

    for (int i = 0; i < s.length(); i++) {

        int num = roman.get(s.charAt(i));

        if (oldNum < num) {
            sum -= oldNum * 2;
        }

        sum += num;

        oldNum = num;
    }

    return sum;
}

}