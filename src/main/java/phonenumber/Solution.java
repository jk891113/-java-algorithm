package phonenumber;

class Solution {
    public String solution(String phone_number) {
        char[] charList = phone_number.toCharArray();

        for (int i = 0; i < charList.length - 4; i++) {
            charList[i] = '*';
        }
        String answer = String.valueOf(charList);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("01033334444");
        solution.solution("027778888");
    }
}
