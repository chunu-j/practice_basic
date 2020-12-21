package practice_sort;

public class prac {
	public static void main(String[] args) {
		int[] num1 = {9, 6, 8, 2, 4, 7, 1, 0, 3, 5};
		int[] num2 = {4, 6, 0, 2, 9, 7, 1, 8, 3, 5};
		int[] num3 = {6, 9, 8, 5, 4, 0, 3, 7, 1, 2};
		
		System.out.println("Simple and Slow");
		System.out.print("Bubble sort: ");
		bubble(num1);
		for(int i : num1) {
			System.out.print(i + " ");
		}
		System.out.print("\nSelection sort: ");
		selection(num2);
		for(int i : num2) {
			System.out.print(i + " ");
		}
		System.out.print("\nInsertion sort: ");
		insertion(num3);
		for(int i : num3) {
			System.out.print(i + " ");
		}
	}
	public static void bubble(int[] data) { // 2
		int temp;
		for(int i = 0 ; i < data.length-1 ; i++) {
			for( int j = 0; j < data.length-1-i ; j++) {
				if(data[j] > data[j+1]) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
	}
	public static void selection(int[] data) { // 1
		int temp, index= 0, min;
		for(int i = 0 ; i < data.length-1 ; i++) {
			min = 9999;
			for(int j = i ; j < data.length ; j++) {
				if(min > data[j]) {
					min = data[j];
					index = j;
				}
			}
			temp = data[i];
			data[i] = data[index];
			data[index] = temp;
		}
	}
	public static void insertion(int[] data) { // 1
		int temp;
		for(int i = 0; i < data.length ; i++) {
			for(int j = i ; j > 0 ; j--) {
				if(data[j-1] > data[j]) {
					temp = data[j-1];
					data[j-1] = data[j];
					data[j] = temp;
				}
			}
		}
	}
}
