package flipternary;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String ter = Integer.toString(n, 3);
        String flip = "";
        for (int i = ter.length() - 1; i >= 0; i--) {
            flip += ter.charAt(i);
        }
        answer = Integer.parseInt(flip, 3);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(45));
        System.out.println(solution.solution(125));
    }
}
