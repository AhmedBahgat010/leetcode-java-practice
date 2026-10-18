class Solution {
    public String tictactoe(int[][] moves) {

        int[][] board = new int[3][3];

        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];

            if (i % 2 == 0) {
                board[row][col] = 1; 
            } else {
                board[row][col] = 2; 
            }
        }

        // هل A فاز؟
        if (isWinner(board, 1)) return "A";

        // هل B فاز؟
        if (isWinner(board, 2)) return "B";

        // مفيش فايز
        if (moves.length == 9) return "Draw";
        return "Pending";
    }

    private boolean isWinner(int[][] b, int p) {

        //    ___
        if (b[0][0] == p && b[0][1] == p && b[0][2] == p) return true;
        if (b[1][0] == p && b[1][1] == p && b[1][2] == p) return true;
        if (b[2][0] == p && b[2][1] == p && b[2][2] == p) return true;

        // |
        if (b[0][0] == p && b[1][0] == p && b[2][0] == p) return true;
        if (b[0][1] == p && b[1][1] == p && b[2][1] == p) return true;
        if (b[0][2] == p && b[1][2] == p && b[2][2] == p) return true;

        // X
        if (b[0][0] == p && b[1][1] == p && b[2][2] == p) return true;
        if (b[0][2] == p && b[1][1] == p && b[2][0] == p) return true;

        return false;
    }
}