package org.comstudy21.ch09;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ch09Ex01 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(640, 480);
		frame.addWindowListener(new WindowAdapter() {
			// winodwListener 인터페이스의 아답터
			public void windowClosing(WindowEvent e){
				frame.dispose();
				System.exit(0);
			}
		});
		frame.setVisible(true);

	}

	public static void test(String[] args) {
		Frame frame = new Frame();
		frame.setSize(640, 480);
		frame.addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {}
			public void windowIconified(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {			}
			public void windowDeactivated(WindowEvent e) {}
			public void windowClosing(WindowEvent e) {
			frame.dispose();	
			System.exit(0);
			}
			public void windowClosed(WindowEvent e) {}
			public void windowActivated(WindowEvent e) {}
		});
	
		// 보여지는 기능은 마지막에
		frame.setVisible(true);
		
	}

}
