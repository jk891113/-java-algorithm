package stringbasic;

import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        String pattern = "\\d{4}|\\{6}";
        return Pattern.matches(pattern, s);
    }
}
