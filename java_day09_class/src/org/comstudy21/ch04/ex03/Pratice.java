package org.comstudy21.ch04.ex04;

import java.util.Scanner;
import org.comstudy21.ch04.ex03.People;

public class Ch04Ex06 {
	public static final int MAX = 100;
	private People[] pArr = new People[MAX];
	private int top = 0; // ������ �Ͼ�� ���� �ȴ�.
	private int sequence = 0; /// ��ü�� ������ �� ���� ���� ��� ����. idx�� ���

	public static final Scanner scan = new Scanner(System.in);

	public Ch04Ex06() {
		System.out.println("����Ʈ ������ ȣ��!");

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
			System.out.println("����...");
			System.exit(0);
			break;
		default:
			System.out.println("�ش� ���� �����ϴ�!");
		}
		System.out.println("----------------------------");
	}

	public int menu() {
		int no = 0;
		System.out.println("1.�Է�  2.���  3.�˻�   4.����  5.����  6.����");
		System.out.print("����: ");
		no = scan.nextInt();
		return no;
	}

	// pArr�� People ��ü�� �߰��Ѵ�.
	public void input() {
		System.out.println("�Է±��...");
		// �� �̻� �Է� �Ҽ� ���ٸ� �ٷ� ������
		if (top >= pArr.length) {
			System.out.println("�� �̻� �Է� �Ұ����մϴ�!");
			return;
		}

		// 1. ��ü ����
		People p = new People();
		// 2. ��ü�� ������ �ֱ�
		p.setIdx(sequence++);
		System.out.print("�����Է�: ");
		p.setName(scan.next());
		System.out.print("��ȭ��ȣ: ");
		p.setPhone(scan.next());

		// 3. ��ü�� �迭�� top������ ����
		pArr[top++] = p;

		System.out.println("�Է� �Ϸ�");
	}

	public void output() {
		System.out.println("��±��...");
		// pArr�� ��Ҹ� top���� �ݺ��ؼ� ����Ѵ�.
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