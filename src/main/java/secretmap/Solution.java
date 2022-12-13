package secretmap;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryArr1 = new String[n];
        String[] binaryArr2 = new String[n];

        for (int i = 0; i < n; i++) {
            binaryArr1[i] = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i])));
            binaryArr2[i] = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr2[i])));
            answer[i] = "";
            for (int j = 0; j < n; j++) {
                if (binaryArr1[i].charAt(j) == '1' || binaryArr2[i].charAt(j) == '1') answer[i] += "#";
                else answer[i] += " ";
            }
        }
        return answer;
    }
}
