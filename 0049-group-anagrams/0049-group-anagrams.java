class Solution {
  
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> val = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {

            String s = strs[i];
        //حولت الكلمه لarray
        // [t,e,a]
            char[] chars = s.toCharArray();
        //بعدها اربتها ب sort [a,e,t]
            Arrays.sort(chars);
        // ارجعها بعد sort to string
            String arrSt = new String(chars);

//            "aet" علشان لو في كلمه نفس الحروف ه مقارنه هتبقا اسهل
//            ========================
            // بشوف هل المفتاح ده موجود في الـ Map:
            // لو موجود، بضيف الكلمة الأصلية للمجموعة الموجودة بالفعل
            if(map.containsKey(arrSt)){
                map.get(arrSt).add(strs[i]);
            }else {
                // لو المفتاح مش موجود، بعمل List جديدة
                // وبضيف فيها الكلمة الأصلية، وبعدها بخزنها في الـ Map

                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                map.put(arrSt, group);
            }
// لو وصلت لآخر كلمة، بجمع كل المجموعات الموجودة في الـ Map
            // وبضيفها في الـ List النهائية

            if (i == strs.length - 1) {
                val.addAll(map.values());
            }}
        return val ;

    }
}