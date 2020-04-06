package controller;

import static controller.Controller.Service;
import static resource.R.*;
import model.Dto;

public class Controller {

	public static void Service() {
		menu.result();
		switch (data.no) {
		case 1:
			input.result();
			Dto Score = data.score; 
			dao.insert(Score);
			break;
		case 2:
			output.result();
			break;
		case 3:
			sum.result();
			break;
		case 4:
			avg.result();
			break;
		case 5:
			list.result();
			break;
		case 6:
			System.out.println("프로그램을 종료합니다");
			System.exit(0);

		}
		data.no = 0;
		Service();
	}
}
