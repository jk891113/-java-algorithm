package oxquiz;

import static java.lang.Integer.parseInt;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int x = parseInt(arr[0]);
            int y = parseInt(arr[2]);
            int z = parseInt(arr[4]);
            if (arr[1].equals("+")) {
                if (x + y == z) answer[i] = "O";
                else answer[i] = "X";
            } else if (arr[1].equals("-")) {
                if (x - y == z) answer[i] = "O";
                else answer[i] = "X";
            }
        }
        return answer;
    }
}
