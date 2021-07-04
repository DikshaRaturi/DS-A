
import java.util.Scanner;

public class ShuffleArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int temp[] = new int[n];
		int i = 0;
		int k = 0;
		int j = n / 2;
		while (j < n) {
			temp[k++] = arr[i++];
			temp[k++] = arr[j++];

		}
		for (i = 0; i < temp.length; i++)
			System.out.print(temp[i] + " ");
	}

}
