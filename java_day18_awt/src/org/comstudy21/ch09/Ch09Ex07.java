package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.GridBagLayout;

public class Ch09Ex07 extends MyFrame {
	Button btn01 = new Button("¾È³ç!");

	public Ch09Ex07() {
		setLayout(new GridBagLayout());
		
		add(btn01);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ch09Ex07();
	}

}
