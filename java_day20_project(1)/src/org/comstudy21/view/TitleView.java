package org.comstudy21.view;

import java.awt.Font;

import javax.swing.JLabel;

public class TitleView extends View {

	public TitleView() {
		init();
	}

	@Override
	public void init() {
		JLabel title = new JLabel("�� ���� �ý���");
		title.setFont(new Font("����ü", Font.BOLD, 28));
		this.add(title);

	}

	@Override
	public void start() {

	}

}
