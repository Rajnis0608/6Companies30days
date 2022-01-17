package com.company;

import java.util.Stack;

public class DecodeTheString {

    static String decodedString(String s){
        String ans = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> ansStack = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = 10 * count + (s.charAt(i) - '0');
                    i++;
                }
                countStack.push(count);
            }
            else if (s.charAt(i) == '[') {
                ansStack.push(ans);
                ans = "";
                i++;
            }
            else if (s.charAt(i) == ']') {
                StringBuilder temp = new StringBuilder (ansStack.pop());
                int repeatTimes = countStack.pop();
                for (int j = 0; j < repeatTimes; j++) {
                    temp.append(ans);
                }
                ans = temp.toString();
                i++;
            }
            else {
                ans += s.charAt(i++);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "3[a3[b]1[ab]]";
        String s2 = "3[a2[c]]";
        System.out.println(decodedString(s2));

    }
}
