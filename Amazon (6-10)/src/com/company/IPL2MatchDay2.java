package com.company;

import java.util.*;

public class IPL2MatchDay2 {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0; i<k;i++) {
            pq.add(arr[i]);
            dq.add(arr[i]);
        }
        ans.add(pq.peek());
        for (int i=k;i<n;i++){
            pq.remove(dq.poll());
            pq.add(arr[i]);
            dq.add(arr[i]);
            ans.add(pq.peek());
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 10, K = 4;
        int arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        System.out.println(max_of_subarrays(arr,N,K));
    }
}
