package pushstring;

class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0;

        int answer = 0;
        for (int i = 0; i < A.length(); i++) {
            answer++;
            A = A.substring(A.length() - 1) + A.substring(0, (A.length() - 1));
            if (A.equals(B)) break;
        }

        if (answer == A.length()) return -1;
        return answer;
    }
}
