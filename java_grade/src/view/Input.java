package view;

import model.Dto;

public class Input implements View {


	public void result() {
		Dto dto = new Dto();
		System.out.println("������ �Է��մϴ�");
		System.out.printf("�̸�: ");
		dto.setName(sc.next());
		System.out.printf("���� ���� �Է�: ");
		dto.setMath(sc.nextInt());
		System.out.printf("���� ���� �Է�: ");
		dto.setEng(sc.nextInt());
		System.out.printf("���� ���� �Է�: ");
		dto.setLan(sc.nextInt());
		data.score = dto;
		
		System.out.println("�Է� �Ϸ�");
	}

}
