package java_day08;

import java.util.Scanner;

public class HH {
	static Scanner sc = new Scanner(System.in);
	static int num1 = 0;

	public static void main(String[] args) {
		int num;
		int num2;
		String cal;
		String plus = "+";
		String minus = "-";
		String division = "/";
		String multiply = "*";
		System.out.println("����(�ѹ��� �Է�)>>");
		num = sc.nextInt();
		cal = sc.next();
		num2 = sc.nextInt();

		if (cal.equals(plus)) {
			System.out.printf("%d + %d = %d", num, num2, num + num2);
		} else if (cal.equals(minus)) {
			System.out.printf("%d - %d = %d", num, num2, num - num2);
		} else if (cal.equals(multiply)) {
			System.out.printf("%d * %d = %d", num, num2, num * num2);
		} else if (cal.equals(division)) {
			if (num2 == 0) {
				System.out.println("0���� ������ �����ϴ�");
			
			} else
				System.out.printf("%d / %d = %d", num, num2, num / num2);
		}
	}

}
