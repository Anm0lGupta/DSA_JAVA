class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowTracker = new boolean[9][9];
        boolean[][] columnTracker = new boolean[9][9];
        boolean[][] boxTracker = new boolean[9][9];

        for(int row =0; row<board.length;row++)
        {
            for(int col = 0; col<board[row].length; col++)
            {
                if(board[row][col] != '.')
                {
                    int index = board[row][col] - '1';
                    int boxIndex = (row/3)*3+(col/3);
                    if(rowTracker[row][index] || columnTracker[col][index] || boxTracker[boxIndex][index])
                    {
                        return false;
                    }
                rowTracker[row][index] = true;
                columnTracker[col][index] = true;
                boxTracker[boxIndex][index] = true;
                }
            }
        }
        return true;
    }
}