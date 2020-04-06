package model;

public class Dao {
	private static int sequence = 1;
	private static int MAX = 100;
	private Dto[] grArr = new Dto[MAX];
	private int top = 0;

	public Dao() {

		
	}
	
	private static Dao instance;
	
	public static Dao getInstance() {
		if(instance == null) {
			instance = new Dao();
		}
		return instance;
	}
	
	public void insert(Dto Score){
		Score.setIdx(sequence++);
		grArr[top++] = Score;
	}

}
