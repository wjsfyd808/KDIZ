package org.comstudy21.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JframeExam extends JFrame {
	
	JPanel contentPane;
	JLabel label = new JLabel("이름");
	JTextField txt = new JTextField();
	JButton button = new JButton("확인");
	
	JPanel p = new JPanel(new FlowLayout());
	
	public JframeExam() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		contentPane = (JPanel)getContentPane();
		p.add(label);
		p.add(txt);
		p.add(button);
		setLayout(new BorderLayout());
		contentPane.add(BorderLayout.NORTH,p);
		ImageIcon image = new ImageIcon("C:\\Users\\user\\Pictures\\png01.jpg");
		JLabel imgLabel = new JLabel(image);
		contentPane.add(imgLabel);
		
		
		setSize(300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JframeExam();
	}

}
