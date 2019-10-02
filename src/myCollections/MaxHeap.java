package myCollections;

public class MaxHeap <T extends Comparable<T>> {

	public final static int DEFAULT_CAPACITY = 100;
	private T[] A;
	private int size;
	
	@SuppressWarnings("unchecked")
	public MaxHeap() {
		A = (T[]) new Object[DEFAULT_CAPACITY];
		size = 0;
	}
	@SuppressWarnings("unchecked")
	public MaxHeap(int cap) {
		A = (T[]) new Object[cap];
		size = 0;
	}
	public MaxHeap(T[] array) {
		A = array;
		size = array.length-1;
	}
	
	public void heapify(int i) {
		int l = Left(i);
		int r = Right(i);
		int largest = i;
		if(l <= size && A[l].compareTo(A[i]) > 0) {
			largest = l;
		}
		if(r <= size && A[r].compareTo(A[largest]) > 0) {
			largest = r;
		}
		if(largest != i) {
			T temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			heapify(largest);

		}
	}
	public int length() {
		return A.length;
	}
	public int size() {
		return size;
	}
	public int Left(int i) {
		return (i*2);
	}
	public int Right(int i) {
		return (i*2 + 1);
	}
	public T[] getA() {
		return A;
	}
	public void buildHeap() {
		for(int i = (int) Math.floor(size/2); i >= 1; i--) {
			heapify(i);
		}
	}
	public void heapSort() {
		buildHeap();
		for(int i = A.length-1; i >= 2; i--) {
			T temp = A[1];
			A[1] = A[i];
			A[i] = temp;
			size = size -1;
			heapify(1);
		}
	}
}
