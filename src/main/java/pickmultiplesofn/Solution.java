package pickmultiplesofn;

import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> arr = new ArrayList<>();
        for (int num: numlist) {
            if (num % n == 0) {
                arr.add(num);
            }
        }
        int[] answer = arr.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}
