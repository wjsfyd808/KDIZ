package org.comstudy21.view;

import javax.swing.JButton;

import org.comstudy21.evt_handler.BtnEvtHandler;

public class ButtonView extends View {
	public JButton allBtn = new JButton("��ü����");
	public JButton inputBtn = new JButton("�߰�");
	public JButton deleteBtn = new JButton("����");
	public JButton searchBtn = new JButton("�˻�");
	public JButton cancelBtn = new JButton("���");

	public ButtonView() {
		init();
		start();
	}

	public void init() {
		add(allBtn);
		add(inputBtn);
		add(deleteBtn);
		add(searchBtn);
		add(cancelBtn);

	}

	public void start() {
		BtnEvtHandler handler = new BtnEvtHandler(this);

		allBtn.addActionListener(handler);
		inputBtn.addActionListener(handler);
		deleteBtn.addActionListener(handler);
		searchBtn.addActionListener(handler);
		cancelBtn.addActionListener(handler);
	}
}