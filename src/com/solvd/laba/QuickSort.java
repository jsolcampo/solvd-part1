package com.solvd.laba;

public class QuickSort {
	private int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	protected void sort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);

			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	private static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 20, 5, 11, 91, 14, 3 };
		int n = arr.length;

		System.out.println("Before sorting array:");
		printArray(arr);
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, n - 1);

		System.out.println("After sorting array:");
		printArray(arr);
	}
}
