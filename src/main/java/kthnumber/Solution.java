package kthnumber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for (int a = 0; a < commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            List<Integer> arr = new ArrayList<>();
            for (int b = i - 1; b < j; b++) {
                arr.add(array[b]);
            }
            arr.sort(Comparator.naturalOrder());
            answer.add(arr.get(k - 1));
        }
        return answer;
    }
}
