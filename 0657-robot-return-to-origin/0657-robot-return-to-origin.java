class Solution {

  public boolean judgeCircle(String moves) {
       if ((moves.length() & 1) != 0) return  false;
        int U = 0,D=0,R=0,L =0;
        for (int i = 0; i < moves.length(); i ++) {
            char m = moves.charAt(i);

            if (m == 'U') {
                U++;
            } else if (m == 'D') {
                D++;
            } else if (m == 'R') {
                R++;
            } else if (m == 'L') {
                L++;
            }
        }
return (U == D) && (R == L);    
        }        
}