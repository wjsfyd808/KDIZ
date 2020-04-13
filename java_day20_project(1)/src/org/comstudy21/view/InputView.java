package org.comstudy21.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InputView extends View {
	JPanel pane = new JPanel(new GridLayout(3, 1));
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();

	public InputView() {
		init();
	}

	@Override
	public void init() {
		pane.add(p1);
		pane.add(p2);
		pane.add(p3);

		add(pane);

		p1.add(new JLabel("��     ��: "));
		p1.add(nameField);
		p2.add(new JLabel("�� �� ��: "));
		p2.add(emailField);
		p3.add(new JLabel("��ȭ��ȣ: "));
		p3.add(phoneField);

		add(pane);

	}

	@Override
	public void start() {

	}
}
