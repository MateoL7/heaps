package userInterface;

import java.util.Arrays;

import myCollections.MaxHeap;

public class Main {

	public static void main(String[] args) {
		
		
		Integer[] a = new Integer[] {0,11,9,12,14,3,15,7,8,1};

		
		MaxHeap<Integer> mh = new MaxHeap<Integer>(a);
		System.out.println("Normal array");
		System.out.println(Arrays.toString(a));
		
	
		mh.buildHeap();
		System.out.println("----------------------------------");
		System.out.println("Heap");
		System.out.println(Arrays.toString(a));
		
		mh.heapSort();
		System.out.println("----------------------------------");
		System.out.println("Sorted heap");
		System.out.println(Arrays.toString(a));
	}
}
