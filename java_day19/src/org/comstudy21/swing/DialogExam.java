package org.comstudy21.swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogExam extends JFrame {
	public DialogExam() {
		int res = JOptionPane.showOptionDialog(null, "원하는 작업을선택", "대화상자", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "가입하기", "다시쓰기", "취소" }, "가입하기");

		System.out.println(res);
	}

	public void test2() {
		in result = JOptionPane.showConfirmDialog(this, "종료?");
		System.out.println("result");
		if(result == 0){
			System.out.println("예");
		}if(result == 1){
			System.out.println("아니오");
		}if(result == 2){
			System.out.println("취소");
		}
	}

	public void test() {

		String inputMsg = JOptionPane.showInputDialog("아이디 입력");
		System.out.println(inputMsg);

		JOptionPane.showMessageDialog(this, inputMsg + "하하");
	}

	public static void main(String[] args) {

		new DialogExam();
	}
}
