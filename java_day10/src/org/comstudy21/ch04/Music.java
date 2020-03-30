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
		System.out.println(Singer + "�� " + Song + " ���� ��");
	}
}

class MusicPlayer extends Music {
	static Music[] List = new Music[7];
	Scanner sc = new Scanner(System.in);
	public int i = 0;

	public void add(Music m) {
		for (int i = 0; i < List.length; i++) {
			System.out.println("���� : ");
			List[i].setSinger(sc.nextLine());
			System.out.println("�뷡 : ");
			List[i].setSong(sc.nextLine());
		}
		if (i == List.length) {
			System.out.println("������ �� á���ϴ�");
			return;
		}
	}

	public static void main(String[] args) {
		Music m1 = new Music("���", "3!4!");
		Music m2 = new Music();
		m2.setSinger("����");
		m2.setSong("1�� 2���� 1");
		Music m3 = new Music("�̼���", "��~�����̿�");

		m1.play(); // ����� 3!4! ���� ��
		m2.play(); // ������ 1�� 2���� 1 ���� ��
		m3.play(); // �̼����� ��~�����̿� ���� ��

		MusicPlayer mp = new MusicPlayer();
		// �ִ� 7��
		mp.add(m1);
		mp.add(m2);
		mp.add(m3);
		mp.add(new Music("������", "�ٶ��� �뷡"));
		mp.play();
	}
}