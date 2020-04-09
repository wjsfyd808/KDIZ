package org.comstudy21.ch09.homework;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import org.comstudy21.ch09.MyFrame;

public class MyCalc extends MyFrame {
	Panel p1 = new Panel(new GridLayout(1, 2, 3, 3));
	Panel p3 = new Panel(new GridLayout(2, 1, 3, 3));
	Panel p3_1 = new Panel(new GridLayout(4,2,3,3));
	Panel p3_2 = new Panel(new GridLayout(2,1,3,3));
	Button btns1 = new Button("1");
	Button btns2 = new Button("1");
	Button btns3 = new Button("1");
	Button btns4 = new Button("1");
	Button btns5= new Button("1");
	Button btns6 = new Button("1");
	Button btns7 = new Button("1");
	Button btns8 = new Button("1");
	Button btns9 = new Button("1");
	Button btns10 = new Button("1");
	Button btns11= new Button("1");
	Button btns12= new Button("1");
	Button btns13= new Button("1");
	
	p3.add(p3_1);
	p3.add(p3_2);

	public MyCalc() {
		p1.add(btns1);
		p1.add(btns2);
		p1.add(p1);
		p1.add(btns3);
		setLayout(new GridBagLayout())
	}

	public static void main(String[] args) {
		new MyCalc;
	}

}
