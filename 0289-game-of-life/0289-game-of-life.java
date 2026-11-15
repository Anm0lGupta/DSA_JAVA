
class Solution {
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[][] copy = new int[m][n];

        for (int i = 0; i < m; i++) {
            copy[i] = board[i].clone();
        }

        int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int count = 0;

                for (int k = 0; k < 8; k++) {

                    int r = i + dr[k];
                    int c = j + dc[k];

                    if (r >= 0 && r < m &&
                        c >= 0 && c < n) {

                        if (copy[r][c] == 1) {
                            count++;
                        }
                    }
                }

                if (copy[i][j] == 0 && count == 3) {
                    board[i][j] = 1;
                }
                else if (copy[i][j] == 1 &&
                        (count == 2 || count == 3)) {
                    board[i][j] = 1;
                }
                else {
                    board[i][j] = 0;
                }
            }
        }
    }
}
