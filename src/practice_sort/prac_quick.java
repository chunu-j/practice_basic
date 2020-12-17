package practice_sort;

public class prac_quick {
	public static void main(String[] args) {
		int[] num = {9, 6, 8, 2, 4, 7, 1, 0, 3, 5};
		int start = 0;
		int end = num.length-1;
		
		quickSort(num, start, end);
		for(int i : num) {
			System.out.print(i + " ");
		}
	}
	public static void quickSort(int[] data, int start, int end) {
		if(start >= end) return;
		int key = start;
		int i = start+1, j = end, temp;
		while(i <= j) {
			while(i <= end && data[i] <= data[key]) {
				i++;
			}
			while(j > start && data[j] > data[key]) {
				j--;
			}
			if(i > j) {
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			}
			else {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		quickSort(data, start, j-1);
		quickSort(data, j+1, end);
	}
}
