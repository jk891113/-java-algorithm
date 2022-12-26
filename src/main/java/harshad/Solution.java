package harshad;

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        char[] ch = Integer.toString(x).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            sum += Integer.parseInt(String.valueOf(ch[i]));
        }
        return x % sum == 0;
    }
}
