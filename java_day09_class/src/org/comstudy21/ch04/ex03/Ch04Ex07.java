package org.comstudy21.ch04.ex03;

import java.util.Arrays;

class Test {
	public void printArr(int[] arr) {
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}

	}

	public void joinArr(int[] arr, int[] arr2) {
		
		}
	}

public class Ch04Ex07 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 60, 70, 80 };
		Test test = new Test();
//		test.printArr(arr1);
		int[] arr3 = test.joinArr(arr1, arr2);// 배열 2개를 인자로 받아서 연결
		test.printArr(arr3);
		
		int[][] arr4 = test.mkArr(arr1,arr2);// 2차원 배열 [3][5]
		test.printArr(arr4);

	}
}
