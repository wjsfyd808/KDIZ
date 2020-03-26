package org.comstudy21.ch04.ex03;
// 자바 빈 객체 생성을 위해 클래스 선언
// 자바 빈은 데이터를 담는 객체
public class People {
	private int idx;
	private String name;
	private String phone;

	public People() {
		this(0, "no-name", "no-phone");
	}

	public People(int idx,String name, String phone){
		this.idx = idx;
		this.name = name;
		this.phone = phone;
		
		
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "[+idx + "," + name + "," + phone+]";
	}
}
