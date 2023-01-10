package insufficientamount;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += price * (i + 1);
        }
        answer = sum > money ? sum - money : 0;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3, 20, 4));
    }
}
