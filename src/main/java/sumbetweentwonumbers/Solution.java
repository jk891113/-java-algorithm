package sumbetweentwonumbers;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        if (a == b) answer = a;
        return answer;
    }
}
