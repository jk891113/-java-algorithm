package foodfight;

public class Solution {
//    public String solution(int[] food) {
//        String answer = "0";
//        for (int i = food.length - 1; i > 0; i--) {
//            for (int j = 0; j < food[i] / 2; j++) answer = i + answer + i;
//        }
//        return answer;
//    }

    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            sb.append(Integer.toString(i).repeat(food[i] / 2));
        }
        return sb.toString() + "0" + sb.reverse();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1, 3, 4, 6};
        int[] arr2 = {1, 7, 1, 2};
        System.out.println(solution.solution(arr1));
        System.out.println(solution.solution(arr2));
    }
}
