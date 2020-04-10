package org.comstudy21.swing;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class WindowApp2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lbLabel_1;
	private JLabel lblLabel_2;
	private JLabel lblLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowApp2 window = new WindowApp2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowApp2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(104, 34, 124, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 84, 124, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(104, 130, 124, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(104, 172, 124, 21);
		frame.getContentPane().add(textField_3);
		
		JLabel lblName = new JLabel("이름");
		lblName.setBounds(35, 37, 57, 15);
		frame.getContentPane().add(lblName);
		
		lbLabel_1 = new JLabel("아이디");
		lbLabel_1.setBounds(35, 87, 57, 15);
		frame.getContentPane().add(lbLabel_1);
		
		lblLabel_2 = new JLabel("패스워드");
		lblLabel_2.setBounds(35, 133, 57, 15);
		frame.getContentPane().add(lblLabel_2);
		
		lblLabel_3 = new JLabel("나이");
		lblLabel_3.setBounds(35, 175, 57, 15);
		frame.getContentPane().add(lblLabel_3);
		
		JButton button = new JButton("가입하기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				String text1 = textField_1.getText();
				String text2 = textField_2.getText();
				String text3 = textField_3.getText();
//				System.out.printf("%s,%s,%s,%s\n ",text,text1,text2,text3);
				
				textArea.append(text+","+text1+","+text2+","+text3+"\n");
			}
		});
		button.setBounds(104, 217, 97, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("다시쓰기");
		button_1.setBounds(243, 217, 97, 23);
		frame.getContentPane().add(button_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(254, 31, 138, 168);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(69, 250, 301, 81);
		frame.getContentPane().add(textArea_1);
	}
}
