package org.comstudy21.ch09;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ch09Ex02 extends Frame implements WindowListener {
	public Ch09Ex02(){
		this.addWindowListener(this);
		this.setSize(480, 320);
	}
	public static void main(String[] args) {
		new Ch09Ex02().setVisible(true);
	}
		public void windowOpened(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {			}
		public void windowDeactivated(WindowEvent e) {}
		public void windowClosing(WindowEvent e) {
		this.dispose();	
		System.exit(0);
		}
		public void windowClosed(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
}