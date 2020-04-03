package model;

public class Dto {
	private int math;
	private int eng;
	private int lan;

	public Dto() {
		this(0, 0, 0);
	}

	public Dto(int math, int eng, int lan) {
		this.math = math;
		this.eng = eng;
		this.lan = lan;

	}

	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
	}

	public int getLan() {
		return lan;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setLan(int lan) {
		this.lan = lan;
	}

	@Override
	public String toString() {
		return "Dto [math=" + math + ", eng=" + eng + ", lan=" + lan + "]";
	}

}
