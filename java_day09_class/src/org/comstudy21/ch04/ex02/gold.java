package org.comstudy21.ch04.ex02;

import java.util.Scanner;

class GulBi {

	int price;
	int present;

	public int cal() {
		return (price/present)*100;
	}
}
public class gold{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GulBi first = new GulBi();
		System.out.println("금액 입력>>");
		first.price = sc.nextInt();
		first.present = sc.nextInt();
		System.out.println("가격은"+ first.cal()+"만 gold");
	}
}