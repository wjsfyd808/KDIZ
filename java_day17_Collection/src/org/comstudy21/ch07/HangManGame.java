package org.comstudy21.ch07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class HangManGame {
	public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException {
		Scanner read = new Scanner(new FileReader("E:\\words.txt"));
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		Vector<String> v = new Vector<>();
		while (read.hasNext()) {
			String word = read.nextLine();
			v.add(word);
		}
		int idx = ran.nextInt(v.size());
		StringBuilder ranWord = new StringBuilder(v.get(idx));
		StringBuilder Q1_ = ranWord;
		String Q1 = ranWord.toString();
		int ran1 = ran.nextInt(ranWord.length());
		ranWord.setCharAt(ran1, '-');
		String Q2 = ranWord.toString();
		int ran2 = ran.nextInt(ranWord.length());
		Q1_.setCharAt(ran2,'-'); 
		String Q2_= Q1_.toString();
		if (ran2 == ran1) {
			do {
				ran2 = ran.nextInt(ranWord.length());
			} while (ran2 != ran1);
		}
		ranWord.setCharAt(ran2, '-');
		String Q3 = ranWord.toString();
		System.out.print("지금부터 행맨 게임을 시작 합니다.");
		while (true) {
			System.out.println(Q3);
			System.out.println(">>");
			String Ans = sc.next();
			String FirC = Character.toString((Q1.charAt(ran1)));
			String SecC = Character.toString((Q2.charAt(ran2)));
			if (Ans.equals(FirC) || Ans.equals(SecC)) {
				if(Ans.equals(FirC)){
					System.out.println(Q2);
					break;
				}else if(Ans.equals(SecC)){
					System.out.println(Q2_);
					System.out.println('2');
					break;
				}
			} else if (!(Ans.equals(FirC))) {
				System.out.println("no");
			} else if (!(Ans.equals(SecC))) {
				System.out.println("no");
		}
		}
	}
}
