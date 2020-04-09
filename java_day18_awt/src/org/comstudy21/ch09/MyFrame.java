package org.comstudy21.ch09;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	public MyFrame() {
		this("MyFrame");
	}

	public MyFrame(String title) {
		this(title, 480, 320);
	}

	public MyFrame(String title,int width,int height){
		super(title);
		setSize(width,height);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
			dispose();
			System.exit(0);
		}
		});
		Dimension d =Toolkit.getDefaultToolkit().getScreenSize();
		int x = d.width/2 - width/2; 
		int y = d.height/2 - height/2;
		setLocation(x,y);
	}

	public static void main(String[] args) {
		new MyFrame("고객관리시스템",640,480).setVisible(true);

	}
}
