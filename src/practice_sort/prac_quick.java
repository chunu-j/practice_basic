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
	public static void quickSort(int[] data, int start, int end) { // 1
		int i = start, j = end;
		int k = start, temp;
		if(i >= j) return;
		while(i <= j) {
			while(i <= end && data[k] >= data[i]) i++;
			while(j > start && data[k] < data[j]) j--;
			if(i > j) {
				temp = data[j];
				data[j] = data[k];
				data[k] = temp;
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
