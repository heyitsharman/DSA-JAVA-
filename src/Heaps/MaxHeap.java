package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxHeap {
    List<Integer> heap;

    public MaxHeap(){
        heap = new ArrayList<>();
    }
    public MaxHeap(int[] nums){
        heap = new ArrayList<>();
        for(int num : nums){
            heap.add(num);
        }
        for(int i=nums.length/2-1; i>=0; i-- ){
            heapify(i);
        }
    }

    public int peek(){
        if(heap.size()==0){
            return Integer.MAX_VALUE;
        }
        return heap.get(0);
    }

    public void HeapSort(){
        for(int i=heap.size()-1; i>=0; i--){
            Collections.swap(heap,0,i);
            heapify2(0,i);

        }
    }

    public void heapify2(int index,int size){
        while(index < size){
            int leftChildIdx = 2 * index + 1;
            int rightChildIdx = 2* index+2;
            int largest = index;
            if(leftChildIdx<size&& heap.get(leftChildIdx)>heap.get(largest)){
                largest = leftChildIdx;
            }
            if(rightChildIdx<size && heap.get(rightChildIdx)>heap.get(largest)){
                largest = rightChildIdx;
            }
            if(largest!=index){
                Collections.swap(heap,index,largest);
                index = largest;
            }
            else{
                break;
            }
        }

    }

    public void heapify(int index){
        while(index < heap.size()){
            int leftChildIdx = 2 * index + 1;
            int rightChildIdx = 2* index+2;
            int largest = index;
            if(leftChildIdx<heap.size() && heap.get(leftChildIdx)>heap.get(largest)){
                largest = leftChildIdx;
            }
            if(rightChildIdx<heap.size() && heap.get(rightChildIdx)>heap.get(largest)){
                largest = rightChildIdx;
            }
            if(largest!=index){
                Collections.swap(heap,index,largest);
                index = largest;
            }
            else{
                break;
            }
        }

    }

    public void insert(int val){
        heap.add(val);

        int index = heap.size()-1;
        while(index > 0){
            int parentIdx = (index-1)/2;
            if(heap.get(index)> heap.get(parentIdx)){
                Collections.swap(heap,parentIdx,index);
                index = parentIdx;
            }
            else{
                break;
            }
        }

    }

    public void pop(){
        if(heap.size()==0){
            return;
        }

        int lastIdx = heap.size()-1;
        heap.set(0,heap.get(lastIdx));
        int val = heap.remove(lastIdx);
        heapify(0);
        
    }

    public  void print(){
        for(int i=0; i<heap.size(); i++){
            System.out.print(heap.get(i)+" ");
        }
    }


    public static void main(String[] args) {
//        MaxHeap maxheap = new MaxHeap();
//        maxheap.insert(10);
//        maxheap.insert(40);
//        maxheap.insert(20);
//        maxheap.insert(30);
//        maxheap.insert(50);

//        System.out.println(maxheap.heap);
//        System.out.println(maxheap.peek());
//        maxheap.heapify(0);
//
//        // Heap after heapify
////        System.out.println("Heap after heapify: " + maxheap.heap);
//        maxheap.print();

        int[] nums = {20,10,30,17,40};
        MaxHeap maxheap = new MaxHeap(nums);
        maxheap.HeapSort();
        maxheap.print();

        
    }

}
