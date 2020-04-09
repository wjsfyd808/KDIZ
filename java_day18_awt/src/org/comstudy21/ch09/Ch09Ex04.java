package org.comstudy21.ch09;

import java.awt.BorderLayout;
import java.awt.Button;


public class Ch09Ex04 extends MyFrame {
	Button btn01 = new Button("east");
	Button btn02 = new Button("west");
	Button btn03 = new Button("south");
	Button btn04 = new Button("north");
	Button btn05 = new Button("center");

	public Ch09Ex04() {
//		add("east", btn01);
		add(BorderLayout.EAST, btn01);
		add(BorderLayout.WEST, btn02);
		add(BorderLayout.SOUTH, btn03);
		add(BorderLayout.NORTH, btn04);
		add(BorderLayout.CENTER, btn05);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ch09Ex04();
	}

}
