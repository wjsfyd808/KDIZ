package org.comstudy21.ch04;

//���� package ������ ���� ����.
class point{
	int x;
	int y;
}
	// ��� Ŭ������ Object Ŭ������ �ڵ� ��� �޴´�.
	// ����� �Ǹ� �θ� Ŭ������ ����� ������(Override) ����.
	// toString() �޼ҵ� ������
	// ��ü�� ��� �Ҷ� �ڵ����� ȣ��ȴ�.
	
//	@Override
//	public String toString() {
//		return ("x="+x + ",y="+y);
//
//	}
//}


public class Ch04Ex01 {

	public static void main(String[] args) {
		// ���������� �����Ѵ�.
		// Ŭ������ ����� ���� �ڷ���(type)�̴�.
		// Ŭ������ ������ ������ ����(reference) ���� �̴�
		// ������������ ��ü�� �ּҰ� ����.
		point pt01;
		// ��ü�� �����ؼ� ���������� �ּ�(������)�� �ѱ��.
		pt01 = new point();
		
		// ���������� ���ؼ� ��ü���� ����� �����Ѵ�.
		// ��� ���� ������: ��(.)
		pt01.x = 100;
		pt01.y = 200;
		
//		System.out.println("x="+pt01.x + ",y="+pt01.y);
		System.out.println(pt01);
	}

}
