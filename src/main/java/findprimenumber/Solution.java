package findprimenumber;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }

        arr[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) continue;
            for (int j = i * 2; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        for (int a : arr) {
            if (a != 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
        System.out.println(solution.solution(5));
        System.out.println(solution.solution(100));
    }
}
