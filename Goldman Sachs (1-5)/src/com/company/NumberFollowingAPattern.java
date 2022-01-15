package com.company;

import java.util.Locale;
import java.util.Stack;

public class NumberFollowingAPattern {
    static String printMinNumberForPattern(String S){
        S = S.toUpperCase();
        Stack<Integer> st = new Stack<>();
        int num = 1;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<S.length();i++){
            if(S.charAt(i) == 'D'){
                st.push(num++);
            }
            if(S.charAt(i) == 'I'){
                st.push(num++);
                while (st.size()!=0){
                    sb.append(st.pop());
                }
            }
        }
        st.push(num);
        while (st.size()!=0){
            sb.append(st.pop());
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(printMinNumberForPattern("IIDDD"));
    }
}
