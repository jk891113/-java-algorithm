package devidestring;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int countX = 0;
        int countElse = 0;
        char x = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) countX++;
            else countElse++;
            if (countX == countElse) {
                answer++;
                if (i != s.length() - 1) {
                    x = s.charAt(i + 1);
                }
            }
        }
        if (countX != countElse) answer++;
        return answer;
    }
}
