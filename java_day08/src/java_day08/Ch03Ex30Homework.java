package java_day08;

import java.util.Arrays;
import java.util.Random;

public class Ch03Ex30Homework {
	public static final int SIZE;
	public static final int MAX;
	public static final int[] Lotto;
	public static Random ran = new Random();
	static 
		SIZE = 6;
		MAX = 45;
		ran = new Random();
		Lotto = new int[SIZE];
	}

	public static void main(String[] args) {
		int cnt = 0;
		while (cnt < 6) {
			int num = 1 + ran.nextInt(MAX);
			boolean flag = true;
			for (int i = 0; i < cnt; i++) {
				if (num == Lotto[i]) {
					flag = false;
					break;
				}
			}
			if(flag){
				Lotto[cnt++] = num;
			}
		
		}
		Arrays.sort(Lotto);
		System.out.println(Arrays.toString(Lotto));
	}

	public static void lotto1(String[] args) {
		// 로또 번호 생성기

		for (int i = 0; i < SIZE; i++) {
			Lotto[i] = 1 + ran.nextInt(MAX);
			for (int j = 0; j < i; j++) {
				if (Lotto[j] == Lotto[i]) {
					Lotto[i] = 1 + ran.nextInt(MAX);
					j = -1;
				}
			}
		}
		System.out.println(Arrays.toString(Lotto));
	}
}
