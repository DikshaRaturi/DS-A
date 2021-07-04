import java.util.Scanner;

public class Richest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int max = 0;
		int ind = 0;
		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {

				sum += arr[i][j];
			}
			if (sum > max) {
				ind = i;
				max = sum;
			}
		}
		System.out.println("Richest customer " + (ind + 1));

	}

}
