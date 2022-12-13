package overlappinglines;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int min = Math.min(lines[0][0], lines[1][0]);
        min = Math.min(min, lines[2][0]);
        int max = Math.max(lines[0][1], lines[1][1]);
        max = Math.max(max, lines[2][1]);
        int index = max - min;
        int[] arr = new int[index];

        for (int[] line : lines) {
            int start = line[0] - min;
            int end = line[1] - min;
            for (int i = start; i < end; i++) {
                arr[i]++;
            }
        }

        for (int idx : arr) {
            if (idx > 1) answer++;
        }
        return answer;
    }
}