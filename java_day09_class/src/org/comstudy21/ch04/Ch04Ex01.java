package org.comstudy21.ch04;

//같은 package 내에서 접근 가능.
class point{
	int x;
	int y;
}
	// 모든 클래스는 Object 클래스를 자동 상속 받는다.
	// 상속이 되면 부모 클래스의 멤버를 재정의(Override) 가능.
	// toString() 메소드 재정의
	// 객체를 사용 할때 자동으로 호출된다.
	
//	@Override
//	public String toString() {
//		return ("x="+x + ",y="+y);
//
//	}
//}


public class Ch04Ex01 {

	public static void main(String[] args) {
		// 참조변수를 선언한다.
		// 클래스는 사용자 정의 자료형(type)이다.
		// 클래스로 선언한 병수는 참조(reference) 변수 이다
		// 참조변수에는 객체의 주소가 들어간다.
		point pt01;
		// 객체를 생성해서 참조변수에 주소(참조값)를 넘긴다.
		pt01 = new point();
		
		// 참조변수를 통해서 객체내의 멤버를 접근한다.
		// 멤버 접근 연사자: 점(.)
		pt01.x = 100;
		pt01.y = 200;
		
//		System.out.println("x="+pt01.x + ",y="+pt01.y);
		System.out.println(pt01);
	}

}
