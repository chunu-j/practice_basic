package practice_sort;

public class prac_heap {
	public static void main(String[] args) {
		int[] num = {9, 6, 8, 2, 4, 7, 1, 0, 3, 5};
		
		heapSort(num);
		for(int i : num) {
			System.out.print(i + " ");
		}
	}
	public static void heapSort(int[] data) {
		int size = data.length;
		for(int i = 1 ; i < size ; i++) {
			int c = i;
			do {
				int root = (c-1) / 2;
				if(data[root] < data[c]) {
					int temp = data[root];
					data[root] = data[c];
					data[c] = temp;
				}
				c = root;
			} while(c != 0);
		}
		for(int i = size-1 ; i >= 0 ; i--) {
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;
			int root = 0;
			int c = 1;
			do {
				c = 2 * root + 1;
				if(c < i - 1 && data[c] < data[c+1]) c++;
				if(c < i && data[root] < data[c]) {
					temp = data[root];
					data[root] = data[c];
					data[c] = temp;
				}
				root = c;
			} while( c < i );
		}
	}
}
