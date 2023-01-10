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

    public int solution2(String A, String B) {
        String tempB = B.repeat(2);
        return tempB.indexOf(A);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution2("hello", "ohell");
        solution.solution2("apple", "elppa");
        solution.solution2("atat", "tata");
        solution.solution2("abc", "abc");
    }
}
