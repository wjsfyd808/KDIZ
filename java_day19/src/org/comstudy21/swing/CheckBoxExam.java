package org.comstudy21.swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckBoxExam extends JFrame {
	JCheckBox ch01 = new JCheckBox("등산", true);
	JCheckBox ch02 = new JCheckBox("윈드서핑", true);
	JCheckBox ch03 = new JCheckBox("라이딩", true);

	JPanel p = new JPanel(new FlowLayout());

	public CheckBoxExam() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.add(ch01);
		p.add(ch02);
		p.add(ch03);

		add("North", p);
		setSize(250, 100);
		setVisible(true);
		CheckboxEventHandler handler = new CheckboxEventHandler();
		ch01.addItemListener(handler);;
		ch02.addItemListener(handler);;
		ch03.addItemListener(handler);;
		
	}

	class CheckboxEventHandler implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource() instanceof JCheckBox){
			JCheckBox check = (JCheckBox)e.getSource();
			if(check== ch01){
				if(e.getStateChange()==ItemEvent.SELECTED){
					System.out.println("등산 선택");
				}else{
					System.out.println("등산 해제");
				}
			}
			if(check== ch02){
				if(e.getStateChange()==ItemEvent.SELECTED){
					System.out.println("윈드서핑 선택");
				}else{
					System.out.println("윈드서핑 해제");
				}
			}
			if(check== ch03){
				if(e.getStateChange()==ItemEvent.SELECTED){
					System.out.println("라이딩 선택");
				}else{
					System.out.println("라이딩 해제");
				}
			}
			
			}
		}
	}

	public static void main(String[] args) {
		new CheckBoxExam();
	}

}
