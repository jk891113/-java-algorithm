package greatestcommondivisorandlowestcommonmultiple;

import java.util.Arrays;

class Solution {
    public static int gcd(int n, int m) {
        if (m % n == 0) return n;
        else return gcd(m % n, n);
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = gcd(n, m);
        int lcm = n * m / gcd;
        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(3, 12)));
        System.out.println(Arrays.toString(solution.solution(2, 5)));
    }
}
