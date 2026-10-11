class Solution {
 public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        char[] arr = new char[s.length()];
        int i = 0; // مؤشر للموقع الحالي

        for (char c : s.toCharArray()) {
            if (c == '(') {
                arr[i++] = ')';
            } else if (c == '{') {
                arr[i++] = '}';
            } else if (c == '[') {
                arr[i++] = ']';
            } else {
                // إذا لم يكن هناك قوس مفتوح سابقاً أو لم يطابق القوس المغلق الحالي
                if (i == 0 || arr[--i] != c) {
                    return false;
                }
            }
        }

        // إذا تم إغلاق كل الأقواس يعود المؤشر إلى 0
        return i == 0;
    }   

}