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
			System.out.println("�����Է�: ");
			a.setName(sc.next());
			System.out.println("��ȭ��ȣ �Է�: ");
			a.setPhone(sc.next());
			
			pArr[i] = a;
		}
		System.out.println();
		//People ��ü�� �����͸� �����ϰ� ����϶�.
		
	}

}
