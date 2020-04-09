package org.comstudy21.ch09;

import java.awt.GridBagLayout;
import java.awt.Label;


public class Ch09Ex06 extends MyFrame {
	
	public Ch09Ex06() {
		setLayout(new GridBagLayout());
		
		add(new Label("æ»≥Á«œººø‰"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ch09Ex06();
	}

}
