package com.mypackage;

import java.util.PriorityQueue;

public class MainApp {
	public static void main(String[] args) {
		Integer [] ia= {1, 6, 3, 7, 3, 9, 0};
		
		PriorityQueue<Integer> pq1= new PriorityQueue<Integer>();
		for(int i: ia){
			pq1.offer(i);
		}
		
		for(int i: ia)
		System.out.println(pq1.poll());
		
		PriorityQueue<Integer> pq2= new PriorityQueue<Integer>(new ReverseSortComparator());
		
		for(int i: ia){
			pq2.offer(i);
		}
		
		for(int i: ia)
			System.out.println(pq2.poll());
		
	}

}
