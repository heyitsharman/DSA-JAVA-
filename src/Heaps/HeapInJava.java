package Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapInJava {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //min heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); //empty min heap

//        adding elements
        minHeap.add(20);
        minHeap.add(10);
        minHeap.add(17);
        minHeap.add(30);
        minHeap.add(40);

        maxHeap.add(20);
        maxHeap.add(10);
        maxHeap.add(17);
        maxHeap.add(30);
        maxHeap.add(40);


//        peek elements
        System.out.println("Min Heap: "+ minHeap.peek());
        System.out.println("Max Heap: "+ maxHeap.peek());

//        removing elements
        minHeap.poll();
        maxHeap.poll();

        System.out.println("After Poll Min Heap: "+ minHeap.peek());
        System.out.println("After Poll Max Heap: "+ maxHeap.peek());


//        size of heap
        System.out.println("Min Heap size: "+ minHeap.size());
        System.out.println("Max Heap size: "+ maxHeap.size());

//        is Empty
        minHeap.poll();
        minHeap.poll();
        minHeap.poll();
        minHeap.poll();
        System.out.println("Min heap is empty? "+ minHeap.isEmpty());
        System.out.println("Max heap is empty? "+ maxHeap.isEmpty());

//        creating min heap using heapify
        int[] nums = {10,17,20,30,40};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int x : nums){
            arr.add(x);
        }
        PriorityQueue<Integer> minHeapUsingHeapify = new PriorityQueue<>(arr);

        System.out.println(minHeapUsingHeapify.peek());


    }
}
