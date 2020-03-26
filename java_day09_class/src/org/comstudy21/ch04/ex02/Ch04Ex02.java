package org.comstudy21.ch04.ex02;

class Point {
	//private�� ��ü ���ο����� ���� �����ϴ�..
	private int x;
	private int y;
	//public�� ��ü �ܺ�(�ٸ� Ŭ����,�ٸ� package)���� ���ٰ���
	//ĸ��ȭ�� ���ؼ� ��� �ʵ�� private �����ϰ�
	//�޼ҵ�� public���� �����Ѵ� (�Ϲ����� Ŭ������ ����)
	public int getX() {
		return x;
	}
	// this��
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "point[x=" + x + ", y= " + y + "]";
	}

}

public class Ch04Ex02 {

	public static void main(String[] args) {
		Point pt = new Point();
		pt.setX(1000);
		pt.setY(2000);
		System.out.println("x=>" + pt.getX());

	}

}
