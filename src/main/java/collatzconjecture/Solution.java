package collatzconjecture;

class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while (true) {
            if (answer == 500) break;
            if (n == 1) return answer;
            n = (n % 2 == 0) ? (n / 2) : (n * 3 + 1);
            answer++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(6));
        System.out.println(solution.solution(16));
        System.out.println(solution.solution(626331));
    }
}
