package com.company;

public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)){
            return "";
        }
        else if (str1.equals(str2)){
            return str1;
        }
        else if (str1.length() > str2.length()){
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }
        else {
            return gcdOfStrings(str2.substring(str1.length()),str1);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC","ABC"));
        System.out.println(gcdOfStrings("ABABAB","ABAB"));
        System.out.println(gcdOfStrings("LEET","CODE"));
    }
}
