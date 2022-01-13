package com.company;

public class TotalDecodingMessages {

    public static long countWays(char[] arr,int n) {
        long[] dp = new long[n+1];
        if(arr[0]=='0'){
            return 0;
        }
        for (int i=0;i<n+1;i++){
            if (i==0 || i==1){
                dp[i] = 1;
                continue;
            }
            if (arr[i - 1] > '0')
                dp[i] = dp[i - 1];

            if (arr[i - 2] == '1' || arr[i - 2] == '2' && arr[i - 1] < '7')
                dp[i] = (dp[i] + dp[i - 2])%(1000000007);

        }
        return dp[n];
    }

    public int CountWays(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;
        return (int)countWays(arr,n);
    }

    public static void main(String[] args) {
        TotalDecodingMessages totalDecodingMessages = new TotalDecodingMessages();
        System.out.println(totalDecodingMessages.CountWays("121"));
    }
}
