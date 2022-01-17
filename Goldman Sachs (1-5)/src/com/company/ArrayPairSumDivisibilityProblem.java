package com.company;

import java.util.HashMap;

public class ArrayPairSumDivisibilityProblem {
    public static boolean canPair(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i]%k) != null) {
                int x = hm.get(nums[i]%k);
                hm.put(nums[i] % k, ++x);
            }else {
                hm.put(nums[i]%k,1);
            }
        }

        if(hm.get(0) != null && hm.get(0)%2 == 0){
            hm.remove(0);
        }else if(hm.get(0) != null && hm.get(0)%2 != 0){
            return false;
        }

        for (Integer i : hm.keySet()){
            int a = hm.get(i);
            if(hm.containsKey(k-i)) {
                int b = hm.get(k - i);
                if (a != b) {
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3};
        int k = 4;
        System.out.println(canPair(arr,k));

    }
}
