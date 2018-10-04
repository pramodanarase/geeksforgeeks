package org.iterative;

public class IterativeBinarySearch {

	public static void main(String[] args) {
		// data is sorted
		int[] arr = { 1, 2, 4, 5, 8, 9, 14 };

		int index = binarySearch(arr, 15);
		if (index != -1) {
			System.out.println("element found at " + index);
		}else {
			System.out.println("element not found");
		}

	}

	private static int binarySearch(int[] arr, int key) {

		int n = arr.length;

		int l = 0;
		int h = n;
		int m = 0;
		int itr =0;
		while (l < h) {
			m = (l + h) / 2;
			if (arr[m] == key) {
				System.out.println("iteration are :"+ itr);
				return m;
			} else {
				if (arr[m] > key)
					h = m-1;
				else
					l = m + 1;
			}
			itr ++;
		}

		System.out.println("iteration are :"+ itr);
		return -1;
	}

}
