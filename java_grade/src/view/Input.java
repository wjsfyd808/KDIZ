package view;

import model.Dto;

public class Input implements View {


	public void result() {
		Dto dto = new Dto();
		System.out.println("점수를 입력합니다");
		System.out.printf("이름: ");
		dto.setName(sc.next());
		System.out.printf("수학 점수 입력: ");
		dto.setMath(sc.nextInt());
		System.out.printf("영어 점수 입력: ");
		dto.setEng(sc.nextInt());
		System.out.printf("국어 점수 입력: ");
		dto.setLan(sc.nextInt());
		data.score = dto;
		
		System.out.println("입력 완료");
	}

}
