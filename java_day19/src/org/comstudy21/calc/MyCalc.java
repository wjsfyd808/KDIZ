package org.comstudy21.calc;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.comstudy21.graphic.MyFrame;

class ButtonHandler implements ActionListener {
	public ButtonHandler() {
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof Button) {
			Button btn = (Button) e.getSource();
			System.out.println(btn.getLabel() + "Hi");
			switch (btn.getLabel()) {

			}
		}
	}
}

public class MyCalc extends MyFrame {
	Button[] btns1 = new Button[12];
	Button[] btns2 = new Button[12];
	Button[] btns3 = new Button[5];
	String[] txt3 = { "M-", "¡î", "%", "1/x", "=" };
	{
		for (int i = 0; i < btns3.length; i++) {
			btns3[i] = new Button(txt3[i]);
		}
	}
	String[] txt1 = { "MC", "MR", "¡ç", "CE", "7", "8", "4", "5", "1", "2", "0", "", };
	String[] txt2 = { "MS", "M+", "C", "¡¾", "9", "/", "6", "*", "3", "-", ".", "+", };
	{
		for (int i = 0; i < btns1.length; i++) {
			btns1[i] = new Button(txt1[i]);
			btns2[i] = new Button(txt2[i]);
		}
	}
	Panel p1 = new Panel(new GridLayout(6, 1, 5, 5));
	Panel p2 = new Panel(new GridLayout(6, 2, 5, 5));
	Panel p3 = new Panel(new GridLayout(3, 1, 5, 5));
	Panel[] p1subs = new Panel[6];
	{
		for (int i = 0; i < p1subs.length; i++) {
			p1subs[i] = new Panel(new GridLayout(1, 1, 5, 5));
			p1.add(p1subs[i]);
		}
		for (int i = 0; i < btns2.length; i++) {
			p2.add(btns2[i]);
		}
		Panel p3sub1 = new Panel(new GridLayout(2, 1, 5, 5));
		Panel p3sub2 = new Panel(new GridLayout(2, 1, 5, 5));
		p3sub1.add(btns3[0]);
		p3sub1.add(btns3[1]);
		p3sub2.add(btns3[2]);
		p3sub2.add(btns3[3]);
		p3.add(p3sub1);
		p3.add(p3sub2);
		p3.add(btns3[4]);
	}
	TextField tf = new TextField();
	Panel keyboard = new Panel(new FlowLayout());
	Panel resultPane = new Panel(null);
	Label resultLabel = new Label(" ");

	public MyCalc() {
		super("MyCalc", 200, 250);

		p1subs[0].add(btns1[0]);
		p1subs[0].add(btns1[1]);
		p1subs[1].add(btns1[2]);
		p1subs[1].add(btns1[3]);
		p1subs[2].add(btns1[4]);
		p1subs[2].add(btns1[5]);
		p1subs[3].add(btns1[6]);
		p1subs[3].add(btns1[7]);
		p1subs[4].add(btns1[8]);
		p1subs[4].add(btns1[9]);
		p1subs[5].add(btns1[10]);

		keyboard.add(p1);
		keyboard.add(p2);
		keyboard.add(p3);

		add(BorderLayout.CENTER, keyboard);
		resultPane.add(resultLabel);
		resultLabel.setBackground(Color.PINK);
		resultLabel.setBounds(0, 0, 180, 40);
		resultLabel.setAlignment(2);
		resultPane.setSize(300, 40);
		add(BorderLayout.NORTH, resultPane);
		add(BorderLayout.NORTH, tf);

		setVisible(true);
	}

	private void play() {
		ButtonHandler handler = new ButtonHandler();
		btns2[6].addActionListener(handler);
		btns2[8].addActionListener(handler);
		btns2[10].addActionListener(handler);
		btns2[12].addActionListener(handler);
	}

	public static void main(String[] args) {
		new MyCalc();
	}
}
