package com.company;

public class SquaresInNxNChessboard {
    static Long squaresInChessBoard(Long N) {
        double d =  N*(N+1)*(2*N+1);
        long ans = (long)d/6;
        return ans;
    }

    public static void main(String[] args) {
        long l = 5;
        System.out.println(squaresInChessBoard(l));
    }
}
