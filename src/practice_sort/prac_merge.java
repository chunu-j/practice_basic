package practice_sort;

public class prac_merge {
	public static void main(String[] args) {
		int[] num = {9, 6, 8, 2, 4, 7, 1, 0, 3, 5};
		int start = 0;
		int end = num.length-1;
		
		mergeSort(num, start, end);
		for(int i : num) {
			System.out.print(i + " ");
		}
	}
	public static int[] tmp = new int[10]; // 1
	public static void merge(int[] data, int start, int middle, int end) {
		int i = start, j = middle+1;
		int k = start;
		while(i <= middle && j <= end) {
			if(data[i] <= data[j]) {
				tmp[k] = data[i];
				i++;
			}
			else {
				tmp[k] = data[j];
				j++;
			}
			k++;
		}
		if(i > middle) {
			for(int t = j ; t <= end ; t++) {
				tmp[k] = data[t];
				k++;
			}
		}
		else {
			for(int t = i ; t <= middle ; t++) {
				tmp[k] = data[t];
				k++;
			}
		}
		for(int t = start ; t <= end ; t++) {
			data[t] = tmp[t];
		}
	}
	public static void mergeSort(int[] data, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			mergeSort(data, start, middle);
			mergeSort(data, middle+1, end);
			merge(data, start, middle, end);
		}
	}
}
