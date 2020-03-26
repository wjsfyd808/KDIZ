package org.comstudy21.ch04.ex03;

import org.comstudy21.ch04.ex03.People;
import java.util.Scanner;

public class Ch04Ex06 {
	public static final int MAX = 100;
	People pArr[] = new People[MAX];
	private int top = 0; // ������ �����Ѵ�
	private int sequence = 0; // ��ü�� �����ɶ� ���� ���� ��� ���� idx�� ���
	public static final Scanner sc = new Scanner(System.in);

	public Ch04Ex06() {
		System.out.println("����Ʈ ������ ȣ��!");

		while (true) {
			run();
		}
	}

	public void run() {
		switch (menu()) {
		case 1:
			System.out.println("�Է±��..");
			input();
			break;
		case 2:
			output();
			break;
		case 3:
			System.out.println("�˻����..");
			break;
		case 4:
			System.out.println("�������..");
			break;
		case 5:
			System.out.println("�������..");
			break;
		case 6:
			System.out.println("����..");
			System.exit(0);
			break;
		default:
			System.out.println("�ش� ���� �����ϴ�!");
		}
		System.out.println("--------------------");
	}

	public int menu() {
		int no = 0;
		System.out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����");
		System.out.println("����: ");
		no = sc.nextInt();
		return no;
	}

	// pArr�� People ��ü�� �߰��Ѵ�.
	public void input() {
		// �� �̻� �Է��� �� ���ٸ� �ٷ� ����
		// 1.��ü����
		// 2.������ �ֱ�
		// 3.��ü�� �迭�� top������ ���
		if (top >= pArr.length) {
			System.out.println("�� �̻� �Է��� �� �����ϴ�.");
			return;
		}
		People p = new People();
		p.setIdx(sequence++);
		System.out.println("���� �Է�: ");
		p.setName(sc.next());
		System.out.println("��ȭ��ȣ: ");
		p.setPhone(sc.next());
		// 3.��ü�� �迭�� top������ ����
		pArr[top++] = p;
		System.out.println("�Է� �Ϸ�");
	}

	public void output() {
		System.out.println("��±��...");
		// pArr�� ��Ҹ� top���� �ݺ��ؼ� ����Ѵ�.
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