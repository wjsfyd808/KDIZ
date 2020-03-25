package java_day08;

import java.util.Arrays;
import java.util.Random;

public class Ch03Ex31Homework {
public static Random ran = new Random();


	public static void main(String[] args) {
		// 45개의 공을 준비해서 그중에 6개를 무작위로 뽑아온다.
		// [1,2,3,4,5,6,7,8,9,1,11,12,13....]

		int [] lotto = new int[6];
		int [] ball = new int[45];
		for(int i=0;i<ball.length;i++) ball[i] = i+1;
		
		for(int i=0;i<lotto.length;) {
			int idx = ran.nextInt(ball.length);
			if(ball[idx] != 0) {
			lotto[i] = ball[idx];
			ball[idx] = 0;
			i++;
			}
		}
		System.out.println(Arrays.toString(lotto));
		
	}

}
