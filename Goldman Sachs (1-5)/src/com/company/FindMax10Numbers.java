package com.company;

import java.util.PriorityQueue;
import java.util.Scanner;

public class FindMax10Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        System.out.println("Enter numbers : ");
        while (n!=0){
            pq.add(sc.nextInt());
            if(pq.size() > 10){
                pq.poll();
            }
            n--;
        }
        for (Integer i : pq){
            System.out.println(i);
        }
    }
}
