import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int k = 0;
		for (int j = 1; j < n; j++) {
			if (arr[k] != arr[j]) {
				k++;
				arr[k] = arr[j];

			}
		}
		System.out.println(k + 1);

	}

}
