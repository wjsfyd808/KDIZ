package org.comstudy21.ch04;

import java.util.Arrays;
import java.util.Scanner;

class Music {
	private String Singer;
	private String Song;

	public Music() {
		this("Singer", "Song");
	}

	public Music(String Singer, String Song) {
		this.Singer = Singer;
		this.Song = Song;
	}

	public String getSinger() {
		return Singer;
	}

	public void setSinger(String Singer) {
		this.Singer = Singer;
	}

	public String getSong() {
		return Song;
	}

	public void setSong(String Song) {
		this.Song = Song;
	}

	public void play() {
		System.out.println(Singer + "의 " + Song + " 실행 중");
	}
}

class MusicPlayer extends Music {
	static Music[] List = new Music[7];
	Scanner sc = new Scanner(System.in);
	public int i = 0;

	public void add(Music m) {
		for (int i = 0; i < List.length; i++) {
			System.out.println("가수 : ");
			List[i].setSinger(sc.nextLine());
			System.out.println("노래 : ");
			List[i].setSong(sc.nextLine());
		}
		if (i == List.length) {
			System.out.println("음악이 꽉 찼습니다");
			return;
		}
	}

	public static void main(String[] args) {
		Music m1 = new Music("룰라", "3!4!");
		Music m2 = new Music();
		m2.setSinger("투투");
		m2.setSong("1과 2분의 1");
		Music m3 = new Music("이선희", "아~옛날이여");

		m1.play(); // 룰라의 3!4! 실행 중
		m2.play(); // 투투의 1과 2분의 1 실행 중
		m3.play(); // 이선희의 아~옛날이여 실행 중

		MusicPlayer mp = new MusicPlayer();
		// 최대 7곡
		mp.add(m1);
		mp.add(m2);
		mp.add(m3);
		mp.add(new Music("조용필", "바람의 노래"));
		mp.play();
	}
}