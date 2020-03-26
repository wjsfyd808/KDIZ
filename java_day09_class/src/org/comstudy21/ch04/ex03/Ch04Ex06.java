package org.comstudy21.ch04.ex03;

import org.comstudy21.ch04.ex03.People;
import java.util.Scanner;

public class Ch04Ex06 {
	public static final int MAX = 100;
	People pArr[] = new People[MAX];
	private int top = 0; // 삭제시 감소한다
	private int sequence = 0; // 객체가 생성될때 감소 없이 계속 증가 idx에 사용
	public static final Scanner sc = new Scanner(System.in);

	public Ch04Ex06() {
		System.out.println("디폴트 생성자 호출!");

		while (true) {
			run();
		}
	}

	public void run() {
		switch (menu()) {
		case 1:
			System.out.println("입력기능..");
			input();
			break;
		case 2:
			output();
			break;
		case 3:
			System.out.println("검색기능..");
			break;
		case 4:
			System.out.println("수정기능..");
			break;
		case 5:
			System.out.println("삭제기능..");
			break;
		case 6:
			System.out.println("종료..");
			System.exit(0);
			break;
		default:
			System.out.println("해당 사항 없습니다!");
		}
		System.out.println("--------------------");
	}

	public int menu() {
		int no = 0;
		System.out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
		System.out.println("선택: ");
		no = sc.nextInt();
		return no;
	}

	// pArr에 People 객체를 추가한다.
	public void input() {
		// 더 이상 입력할 수 없다면 바로 종료
		// 1.객체생성
		// 2.데이터 넣기
		// 3.객체를 배열의 top번지에 담기
		if (top >= pArr.length) {
			System.out.println("더 이상 입력할 수 없습니다.");
			return;
		}
		People p = new People();
		p.setIdx(sequence++);
		System.out.println("성명 입력: ");
		p.setName(sc.next());
		System.out.println("전화번호: ");
		p.setPhone(sc.next());
		// 3.객체를 배열의 top번지에 저장
		pArr[top++] = p;
		System.out.println("입력 완료");
	}

	public void output() {
		System.out.println("출력기능...");
		// pArr의 요소를 top까지 반복해서 출력한다.
		for (People p : pArr) {
			if (p == null)
				break;
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		new Ch04Ex06();

	}

}