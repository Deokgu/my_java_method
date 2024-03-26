public class ArrSort {
	
	//Bubble Sort 버블 정렬
	public void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 1; j < arr.length - i; j++) {
				if(arr[j] < arr[j-1]) {
					swapNumber(arr, j, j-1);
				}
			}
		}
	}
	
	//Selection Sort 셀렉션 정렬
	public void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					swapNumber(arr, i, j);
				}
			}
		}
	}
	
	
	public void swapNumber(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
