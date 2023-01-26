package fruitdealer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        if (score.length < m) return answer;
        Arrays.sort(score);

        List<Integer> box = new ArrayList<>();
        for (int i = score.length - 1; i >= 0; i--) {
            int min = score[i];
            box.add(min);
            k = Math.min(k, min);
            if (box.size() == m) {
                answer += k * m;
                box.clear();
            }
        }
        return answer;
    }

//    public int solution(int k, int m, int[] score) {
//        int answer = 0;
//        Arrays.sort(score);
//
//        for(int i = score.length - m; i >= 0; i -= m){
//            answer += score[i] * m;
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1, 2, 3, 1, 2, 3, 1};
        int[] arr2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution.solution(3, 4, arr1));
        System.out.println(solution.solution(4, 3, arr2));
    }
}
