package java_day08;

public class Ch03Ex35 {
	static void add(int start, int end) {
		int total = 0;
		for (int i = start; i < end; i++) {
			if(i==5){
				return;
			}
			 total += i;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {

		add(1, 10); // 1부터10까지의 누적 출력

	}

}
