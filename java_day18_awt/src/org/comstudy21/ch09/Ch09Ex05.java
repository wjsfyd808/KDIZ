package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.GridLayout;

public class Ch09Ex05 extends MyFrame {
	Button[] btns = new Button[8];
	{
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new Button("Button" + i);
		}
	}
	GridLayout grid = new GridLayout(4, 2);
	// »ý¼ºÀÚ
	public Ch09Ex05() {
		setLayout(grid);

		for (int i = 0; i < btns.length; i++) {
			add(btns[i]);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ch09Ex05();
	}

}
