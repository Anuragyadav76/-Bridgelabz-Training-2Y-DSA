package RecursionandBacktracking;

public class WordSearch {

    static int ROW = 4;
    static int COL = 4;

    static boolean search(char[][] grid, String word, int row, int col, int index, boolean[][] visited) {

        if (index == word.length())
            return true;

        if (row < 0 || col < 0 || row >= ROW || col >= COL)
            return false;

        if (visited[row][col] || grid[row][col] != word.charAt(index))
            return false;

        visited[row][col] = true;

        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        for (int d = 0; d < 8; d++) {
            if (search(grid, word, row + dx[d], col + dy[d], index + 1, visited))
                return true;
        }

        visited[row][col] = false; // backtrack

        return false;
    }

    public static void main(String[] args) {

        char[][] grid = {
                {'C','A','T','S'},
                {'O','R','E','A'},
                {'D','E','A','M'},
                {'E','L','L','S'}
        };

        String word = "DREAM";

        boolean found = false;

        boolean[][] visited = new boolean[ROW][COL];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {

                if (search(grid, word, i, j, 0, visited)) {
                    found = true;
                    break;
                }
            }
        }

        if (found)
            System.out.println("Word Found");
        else
            System.out.println("Word Not Found");
    }
}
