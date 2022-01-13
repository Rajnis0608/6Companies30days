package com.company;

public class FindFidWhichGetsTheDamagedToy {

    static int solution(int N,int M,int K){
        return (K+M-1)%N;
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 8;
        int k = 2;
        System.out.print(solution(n, m, k));
    }
}
