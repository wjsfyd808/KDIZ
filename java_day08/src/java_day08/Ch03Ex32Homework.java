package java_day08;

import java.util.Arrays;

public class Ch03Ex32Homework {
	static int[][] arr = new int[5][5];
	static int number = 1;

	public static void printArr() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((arr[i][j] == 0 ? " " : arr[i][j]) + "\t");
			}
			System.out.println();
		}
	}

	public static final int RIGHT = 0;
	public static final int DOWN = 1;
	public static final int LEFT = 2;
	public static final int UP = 3;

	public static void main(String[] args) {
		// 달팽이 모양
		int number = 1;
		int no = RIGHT;
		int i = 0, j = 0;
		int cnt = 0;
		while (cnt < 25) {
			switch (no) {
			case RIGHT:
				arr[i][j++] = number++;
				if (j == 5 || arr[i][j]!= 0) {
					no++;
					j--;
					i++;
				}
				break;
			case DOWN:
				arr[i++][j] = number++;
				if (i == 5|| arr[i][j]!= 0) {
					no++;
					i--;
					j--;
				}
				break;
			case LEFT:
				arr[i][j--] = number++;
				if (j == -1|| arr[i][j]!= 0) {
					no = UP;
					j++;
					i--;
				}
				break;
			case UP:
				arr[i--][j] = number++;
				if (arr[i][j] != 0) {
					no = RIGHT;
					i++;
					j++;
				}
				break;
			}
			cnt++;
		}
		printArr();

	}

	public static void main1(String[] args) {
		// 모래시계 모양

		for (int i = 0; i < 5; i++) {
			int start = i < 2 ? i : 4 - i;
			int end = i < 2 ? 4 - i : i;
			for (int j = start; j <= end; j++) {
				arr[i][j] = number++;

			}
		}
		printArr();
	}
}
