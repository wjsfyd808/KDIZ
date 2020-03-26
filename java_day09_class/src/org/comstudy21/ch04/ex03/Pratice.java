package org.comstudy21.ch04.ex04;

import java.util.Scanner;
import org.comstudy21.ch04.ex03.People;

public class Ch04Ex06 {
	public static final int MAX = 100;
	private People[] pArr = new People[MAX];
	private int top = 0; // 삭제가 일어나면 감소 된다.
	private int sequence = 0; /// 객체가 생성될 때 감소 없이 계속 증가. idx에 사용

	public static final Scanner scan = new Scanner(System.in);

	public Ch04Ex06() {
		System.out.println("디폴트 생성자 호출!");

		while (true) {
			run();
		}
	}

	public void run() {
		switch (menu()) {
		case 1:
			input();
			break;
		case 2:
			output();
			break;
		case 6:
			System.out.println("종료...");
			System.exit(0);
			break;
		default:
			System.out.println("해당 사항 없습니다!");
		}
		System.out.println("----------------------------");
	}

	public int menu() {
		int no = 0;
		System.out.println("1.입력  2.출력  3.검색   4.수정  5.삭제  6.종료");
		System.out.print("선택: ");
		no = scan.nextInt();
		return no;
	}

	// pArr에 People 객체를 추가한다.
	public void input() {
		System.out.println("입력기능...");
		// 더 이상 입력 할수 없다면 바로 끝내기
		if (top >= pArr.length) {
			System.out.println("더 이상 입력 불가능합니다!");
			return;
		}

		// 1. 객체 생성
		People p = new People();
		// 2. 객체에 데이터 넣기
		p.setIdx(sequence++);
		System.out.print("성명입력: ");
		p.setName(scan.next());
		System.out.print("전화번호: ");
		p.setPhone(scan.next());

		// 3. 객체를 배열의 top번지에 저장
		pArr[top++] = p;

		System.out.println("입력 완료");
	}

	public void output() {
		System.out.println("출력기능...");
		// pArr의 요소를 top까지 반복해서 출력한다.
		for (People p : pArr) {
//			if (p == null)
//				break;
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		new Ch04Ex06();
	}
}