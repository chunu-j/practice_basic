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
	public static void bubble(int[] num) { // 1
		int temp;
		for(int i = 0; i < num.length-1 ; i++) {
			for(int j = 0 ; j < num.length -1 -i ; j++) {
				if(num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
	}
	public static void selection(int[] num) {
		int temp, min, index;
		for(int i = 0; i < num.length ; i++) {
			min = 9999;
			index = 0;
			for(int j = i ; j < num.length ; j++) {
				if(min > num[j]) {
					min = num[j];
					index = j;
				}
			}
			temp = num[i];
			num[i] = num[index];
			num[index] = temp;
		}
	}
	public static void insertion(int[] num) {
		int temp;
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = i ; j > 0 ; j--) {
				if(num[j-1] > num[j]) {
					temp = num[j-1];
					num[j-1] = num[j];
					num[j] = temp;
				}
			}
		}
	}
}
