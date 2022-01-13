package com.company;

public class RunLengthEncoding {

    static String encode(String str) {
        char[] charArr = str.toCharArray();
        String ans = "";
        int i=0;
        while (i < charArr.length){
            int count = 0;
            int j=i;
            ans += charArr[i];
            while (j < charArr.length && Character.compare(charArr[i],charArr[j])==0){
                j++;
                count++;
            }
            ans += j-i;
            i=j;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(encode("abbbcdddd"));
    }
}
