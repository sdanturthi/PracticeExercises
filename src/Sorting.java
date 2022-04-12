import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int a[] = { 2, 3, 1, 4, 12, 89, 78, 2, 32 };
		int arrLen = a.length;
		int j, l;

		for (int i = 0; i < arrLen; i++) {
			j = i;
			for (int k = (i+1); k < arrLen; k++) {
				if (a[j] > a[k]) {
					l = a[j];
					a[j] = a[k];
					a[k] = l;
				}
			}
		}
		
	
		System.out.print(Arrays.toString(a));
	}
}
