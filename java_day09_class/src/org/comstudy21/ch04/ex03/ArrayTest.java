package org.comstudy21.ch04.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		People[] pArr = new People[3];
		People a = new People();
		for(int i = 0 ; i <pArr.length; i++){
			pArr[i]= new People();
			a.setIdx(i);
			System.out.println("성명입력: ");
			a.setName(sc.next());
			System.out.println("전화번호 입력: ");
			a.setPhone(sc.next());
			
			pArr[i] = a;
		}
		System.out.println();
		//People 객체에 데이터를 저장하고 출력하라.
		
	}

}
