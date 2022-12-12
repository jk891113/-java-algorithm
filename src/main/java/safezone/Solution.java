package safezone;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        List<List<Integer>> indexList = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                List<Integer> index = new ArrayList<>();
                if (board[i][j] == 1) {
                    index.add(i);
                    index.add(j);
                    indexList.add(index);
                }
            }
        }

        for (int i = 0; i < indexList.size(); i++) {
            int x = indexList.get(i).get(1);
            int y = indexList.get(i).get(0);
            if (x > 0) board[y][x - 1] += 1;
            if (x < board.length - 1) board[y][x + 1] += 1;
            if (y > 0) {
                board[y - 1][x] += 1;
                if (x > 0) board[y - 1][x - 1] += 1;
                if (x < board.length - 1) board[y - 1][x + 1] += 1;
            } if (y < board.length - 1) {
                board[y + 1][x] += 1;
                if (x > 0) board[y + 1][x - 1] += 1;
                if (x < board.length - 1) board[y + 1][x + 1] += 1;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}
