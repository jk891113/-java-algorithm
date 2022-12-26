package bedivisiblebydivisor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        arr = Arrays.stream(arr).sorted().toArray();
        for (int i : arr) {
            if (i % divisor == 0) answer.add(i);
        }
        if (answer.isEmpty()) answer.add(-1);
        return answer;
    }
}
