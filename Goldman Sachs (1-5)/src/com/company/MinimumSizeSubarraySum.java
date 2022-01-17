package com.company;

public class MinimumSizeSubarraySum {
    //Continuous sub array
    public static int minimumSizeSubarraySum(int[] nums,int target){
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int n=nums.length;
        int sum=0;
        while(j<n){
            sum+=nums[j];
            if(sum>=target){
                while(i<=j && sum>=target){
                    min=Math.min(j-i+1,min);
                    sum-=nums[i];
                    i++;
                }
            }
            j++;
        }
        if (min==Integer.MAX_VALUE)
            return 0;
        else
            return min;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minimumSizeSubarraySum(arr,target));
    }
}

