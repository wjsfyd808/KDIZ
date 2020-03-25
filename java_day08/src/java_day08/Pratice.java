package java_day08;

import java.util.Scanner;

public class Pratice {
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
		System.out.println("연산(한번씩 입력)>>");
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
				System.out.println("0으로 나눌수 없습니다");
			} else
				System.out.printf("%d / %d = %.2f", num, num2,((double)num/(double)num2));
		}
	}



	public static void no11_2(String[] args) {
		int num;
		System.out.println("달을 입력하세요(1~12)>>");
		num = sc.nextInt();
		switch (num) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못입력");

		}

	}

	public static void no11_1(String[] args) {
		int num;
		System.out.println("달을 입력하세요(1~12)>>");
		num = sc.nextInt();
		if (num > 2 && num < 6) {
			System.out.println("봄");
		} else if (num > 5 && num < 9) {
			System.out.println("여름");
		} else if (num > 8 && num < 12) {
			System.out.println("가을");
		} else if ((num > 0 && num <= 2) || num == 12) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못입력");
		}

	}

	public static void no8(String[] args) {
		final int x = 200, y = 100;
		int x1, x2, y1, y2;
		System.out.println("점의 좌표(x,y)를 입력하세요>>");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("다음 점의 좌표(x,y)를 입력하세요>>");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		if ((x < x1 || x < x2) || (x < y1 || x < y2)) {
			System.out.println("충돌합니다");
		} else if ((x < x1 || x < y1) && (x < x2 || x < y2)) {
			System.out.println("충돌하지 않습니다");
		}

	}

	public static void no7(String[] args) {
		final int x = 200, y = 200;
		int x1, y1;
		System.out.println("점의 좌표(x,y)를 입력하세요>>");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		if (x < x1 || y < y1) {
			System.out.println("좌표값을 초과했습니다");
			main(null);
		}
		if (x1 > 100 || y1 > 100) {
			System.out.printf("(%d,%d)는 사각형 안에 있습니다.", x1, y1);
		} else
			System.out.printf("(%d,%d)는 사각형 밖에 있습니다.", x1, y1);
	}

	public static void no6(String[] args) {
		int num = 0;
		System.out.println("1~99사이의 정수를 입력하시오>>");
		num = sc.nextInt();

		if (num % 3 == 0 && num / 3 < 4) {
			System.out.println("박수짝");
		} else if (num % 30 == 3 || num % 30 == 6 || num % 30 == 9) {
			System.out.println("박수짝짝");
		} else if (num % 10 == 0 || (num % 10) == 3 || (num % 10) == 6 || (num % 10) == 9)
			System.out.println("박수짝");
	}

	public static void no5(String[] args) {
		int num1, num2, num3;
		int a, b, c;
		System.out.println("정수 3개 입력하시오>>");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			a = num1;
			b = num2;
			c = num3;
		} else if (num2 > num1 && num2 > num3) {
			a = num2;
			b = num1;
			c = num3;
		} else {
			a = num3;
			b = num2;
			c = num1;
		}

		if (a < b + c) {
			System.out.println("삼각형이 됩니다.");

		} else {
			System.out.println("삼각형이 될 수 없습니다.");
		}

	}

	public static void no4(String[] args) {
		int num1, num2, num3;

		System.out.println("정수 3개 입력>>");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("같은 값은 입력 할수 없습니다.");
			no4(null);
		}
		if (num1 > num2 && num2 < num3 && num1 > num3) {
			System.out.printf("중간 값은 %d", num3);
		} else if (num2 > num1 && num1 > num3 && num2 > num3) {
			System.out.printf("중간 값은 %d", num1);
		} else if (num3 > num2 && num2 > num1 && num3 > num1) {
			System.out.printf("중간 값은 %d", num2);
		} else {
			System.out.printf("중간 값은 %d", num3);
		}

	}

	public static void no3(String[] args) {
		int a, b, c, d, e, f, g;
		System.out.println("금액을 입력하시오>>");
		num = sc.nextInt();
		a = num / 50000;
		b = (num % 50000) / 10000;
		c = (num % 50000) % (10000) / 1000;
		d = (num % 50000) % (10000) % 1000 / 100;
		e = (num % 50000) % (10000) / 1000 % 100 / 50;
		f = (num % 50000) % (10000) / 1000 % 100 % 50 / 10;
		g = (num % 50000) % (10000) / 1000 % 100 % 50 % 10 / 1;

		System.out.printf("5만원권 %d장\n", a);
		System.out.printf("1만원권 %d장\n", b);
		System.out.printf("1천원권 %d장\n", c);
		System.out.printf("100원동전 %d개\n", d);
		System.out.printf("50원동전 %d개\n", e);
		System.out.printf("10원동전 %d개\n", f);
		System.out.printf("1원동전 %d개\n", g);
	}

	public static void no2(String[] args) {
		System.out.println("2자리의 수 정수 입력(10~99)>>");
		num = sc.nextInt();
		if (num % 11 == 0) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		} else {
			no2(null);
		}
	}

	public static void no1(String[] args) {
		int cash = 0;
		System.out.println("원화를 입력하세요(단위 원)>>");
		cash = sc.nextInt();
		double dollor = cash / 1100.0;
		System.out.printf("%d원은 $%.1f입니다.", cash, dollor);

	}

}
