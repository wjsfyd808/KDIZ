package org.comstudy21.ch04.ex02;

class Point {
	//private는 객체 내부에서만 접근 가능하다..
	private int x;
	private int y;
	//public은 객체 외부(다른 클래스,다른 package)에서 접근가능
	//캡슐화를 위해서 멤버 필드는 private 선언하고
	//메소드는 public으로 선언한다 (일반적인 클래스의 구조)
	public int getX() {
		return x;
	}
	// thisㅜ
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
