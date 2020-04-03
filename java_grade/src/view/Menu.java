package view;


public class Menu implements View {

	public void result() {
		System.out.println("1)점수입력  2)점수수정  3)총점계산  4)평균내기  5)등수출력  6)종료");
		System.out.print(">>");
		data.no = sc.nextInt();

	}

}
