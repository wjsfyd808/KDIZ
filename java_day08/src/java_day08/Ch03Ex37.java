package java_day08;

import java.util.Scanner;

public class Ch03Ex37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 100;
		int div = 0;


		while (true) {
			System.out.println("나눈 수를 입력 :");
			div = sc.nextInt();
			int res = 0;

			try {
				res=100/div;
			} catch (ArithmeticException e) {
				System.err.println("0으로 나눌수 없습니다!");
				continue;
			}
			System.out.println("100을 " + div + "으로 나눈 몫: " + res);
			break;
		}
		sc.close();
	}

}
