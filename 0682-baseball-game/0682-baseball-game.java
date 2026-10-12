class Solution {
public int calPoints(String[] operations) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < operations .length; i++) {
            String o =operations[i];
            if(o.equals("C") )
                arr.removeLast();
            else if (o.equals("D")) {
                int num =arr.getLast();
                    arr.addLast(num* 2);
               
            }
            else  if (o.equals("+")){
                int sum = arr.get(arr.size() - 1) + arr.get(arr.size() - 2);
                arr.addLast(sum);
            }
            else  if (o.equals("+")){
                arr.addLast(arr.getLast());
            }else {
                arr.addLast(Integer.parseInt(operations[i]));
            }

        }
        int sumAll= 0 ;
        for (Integer s :arr){

            sumAll=sumAll+s;
        }

return  sumAll;
    }
}