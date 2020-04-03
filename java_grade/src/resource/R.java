package resource;

import java.util.Scanner;

import view.*;

public interface R {
	String MENU = "점수 출력기";
	int MAX = 100;
	
	
	Menu menu = new Menu();
	List list = new List();
	Avg avg = new Avg();
	Sum sum = new Sum();
	
	Scanner sc = new Scanner(System.in);
	
	Data data = new Data();

	void result();
			
	

}
