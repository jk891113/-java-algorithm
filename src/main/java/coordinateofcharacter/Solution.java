package coordinateofcharacter;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        for(String key: keyinput) {
            if (key.equals("up") && board[1] / 2 > answer[1]) {
                answer[1] += 1;
            } else if (key.equals("down") && -(board[1] / 2) < answer[1]) {
                answer[1] -= 1;
            } else if (key.equals("left") && -(board[0] / 2) < answer[0]) {
                answer[0] -= 1;
            } else if (key.equals("right") && board[0] / 2 > answer[0]) {
                answer[0] += 1;
            }
        }
        return answer;
    }
}