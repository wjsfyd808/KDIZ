package org.comstudy21.swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogExam extends JFrame {
	public DialogExam() {
		int res = JOptionPane.showOptionDialog(null, "���ϴ� �۾�������", "��ȭ����", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "�����ϱ�", "�ٽþ���", "���" }, "�����ϱ�");

		System.out.println(res);
	}

	public void test2() {
		in result = JOptionPane.showConfirmDialog(this, "����?");
		System.out.println("result");
		if(result == 0){
			System.out.println("��");
		}if(result == 1){
			System.out.println("�ƴϿ�");
		}if(result == 2){
			System.out.println("���");
		}
	}

	public void test() {

		String inputMsg = JOptionPane.showInputDialog("���̵� �Է�");
		System.out.println(inputMsg);

		JOptionPane.showMessageDialog(this, inputMsg + "����");
	}

	public static void main(String[] args) {

		new DialogExam();
	}
}
