package twodimension;


import java.util.*;

class WithList {
    public List solution(int[] num_list, int n) {
        List<List<Integer>> answer = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr.add(num_list[count]);
                count += 1;
            }
            answer.add(arr);
        }
        return answer;
    }
}

