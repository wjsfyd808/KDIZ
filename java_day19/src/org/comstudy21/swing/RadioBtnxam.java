package org.comstudy21.swing;

import java.awt.BufferCapabilities;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioBtnxam extends JFrame {
	JRadioButton rb01 = new JRadioButton("�л�", true);
	JRadioButton rb02 = new JRadioButton("������", false);
	JRadioButton rb03 = new JRadioButton("���ȸ��", true);
	JRadioButton rb04 = new JRadioButton("�Ϲ�ȸ��", false);

	ButtonGroup gr01 = new ButtonGroup();
	ButtonGroup gr02 = new ButtonGroup();

	public RadioBtnxam() {
		gr01.add(rb01);
		gr01.add(rb02);
		gr02.add(rb03);
		gr02.add(rb04);

		JPanel p = new JPanel(new FlowLayout());
		p.add(rb01);
		p.add(rb02);
		p.add(rb03);
		p.add(rb04);
		add("North", p);
		
		setSize(640,480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioBtnxam();

	}

}
