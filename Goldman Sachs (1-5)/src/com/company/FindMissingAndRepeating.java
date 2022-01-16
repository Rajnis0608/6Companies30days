package com.company;

import java.util.HashSet;

public class FindMissingAndRepeating {
    static int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        HashSet<Integer> hm = new HashSet<>();
        for (int i=0;i<n;i++){
            if(hm.contains(arr[i])){
                ans[0] = arr[i];
            }
            hm.add(arr[i]);
        }
       for (int i=1;i<=arr.length;i++){
           if(!hm.contains(i)){
               ans[1] = i;
           }
       }
       return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 3};
        int ans[] = findTwoElement(arr,arr.length);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
