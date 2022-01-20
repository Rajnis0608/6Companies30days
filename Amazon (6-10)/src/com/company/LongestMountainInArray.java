package com.company;

public class LongestMountainInArray {
    public static int longestMountain(int[] arr) {
        if(arr.length < 3){
            return 0;
        }
        boolean peak = false;
        boolean valley = false;
        int i = 0;
        int ans = 0;
        while(i < arr.length-1){
            if(arr[i] < arr[i+1]){
                int mountStart = i;
                while(i < arr.length-1 && arr[i] < arr[i+1]){
                    i++;
                    peak = true;
                }
                while(i < arr.length-1 && arr[i] > arr[i+1]){
                    i++;
                    valley = true;
                }
                if(peak && valley){
                    ans = Math.max(ans,i-mountStart+1);
                }
                peak = false;
                valley = false;

            }else{
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3,4,5,6};
        System.out.println(longestMountain(arr));
        int[] arr2 = {2,1,4,7,3,2,5};
        System.out.println(longestMountain(arr2));
    }
}
