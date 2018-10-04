package org.recursive;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 7, 8, 12 };

		int index = binarySearch(arr, 12);
		if (index != -1) {
			System.out.println("element found at: " + index);
		} else {
			System.out.println("element not found ");
		}
	}

	private static int binarySearch(int[] arr, int key) {

		int l = 0;
		int h = arr.length-1;

		return binarySearch(arr, l, h, key);
	}

	private static int binarySearch(int[] arr, int l, int h, int key) {

		int m = (l + h) / 2;
		if (m >= l && m <= h) {
			if (arr[m] == key) {
				return m;
			}

			if (arr[m] > key) {
				// key on right side
				return binarySearch(arr, l, m - 1, key);
			} else {
				return binarySearch(arr, m + 1, h, key);
			}
		}
		return -1;
	}

}
