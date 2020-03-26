package org.comstudy21.ch04.ex02;

 class Ch04Ex04 {

	public void print(int a) {
		System.out.println("print1 호출");
		System.out.println(a);
	}

	public void print(int a, int b) {
		System.out.println("print2 호출");
		System.out.println(a);
		System.out.println(b);
	}

	public void print(int a, int b, int c) {
		System.out.println("print3 호출");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		Ch04Ex04 obj = new Ch04Ex04();
		obj.print(100,200,300);
	}
}
