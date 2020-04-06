package model;

public class Dto {
	private int idx;
	private String name;
	private int math;
	private int eng;
	private int lan;
	
	public Dto() {
		this(0,"", 0, 0, 0);
	}

	public Dto(int idx,String name,int math, int eng, int lan) {
		this.idx = idx;
		this.math = math;
		this.eng = eng;
		this.lan = lan;

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
		return "Dto [idx=" + idx + ", name=" + name + ", math=" + math + ", eng=" + eng + ", lan=" + lan + "]";
	}




}
