package resource;

import java.util.Scanner;
import model.Dao;
import view.*;

public interface R {
	String MENU = "점수 출력기";
	int MAX = 100;
	
	
	Menu menu = new Menu();
	List list = new List();
	Avg avg = new Avg();
	Sum sum = new Sum();
	Input input = new Input();
	Output output = new Output();
	
	Scanner sc = new Scanner(System.in);
	
	Data data = new Data();
	Dao dao = Dao.getInstance();

	void result();
			
	

}
