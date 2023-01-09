package babbling;

public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String b : babbling) {
            b = b.replace("aya", "1");
            b = b.replace("ye", "1");
            b = b.replace("woo", "1");
            b = b.replace("ma", "1");
            if (b.matches("\\d*")) answer++;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] b = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        Solution solution = new Solution();
        solution.solution(a);
        solution.solution(b);
    }
}
