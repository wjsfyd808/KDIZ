package java_day08;

import java.util.Scanner;

public class Ch03Ex37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 100;
		int div = 0;


		while (true) {
			System.out.println("���� ���� �Է� :");
			div = sc.nextInt();
			int res = 0;

			try {
				res=100/div;
			} catch (ArithmeticException e) {
				System.err.println("0���� ������ �����ϴ�!");
				continue;
			}
			System.out.println("100�� " + div + "���� ���� ��: " + res);
			break;
		}
		sc.close();
	}

}
