package org.comstudy21.swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckBoxExam extends JFrame {
	JCheckBox ch01 = new JCheckBox("���", true);
	JCheckBox ch02 = new JCheckBox("���弭��", true);
	JCheckBox ch03 = new JCheckBox("���̵�", true);

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
					System.out.println("��� ����");
				}else{
					System.out.println("��� ����");
				}
			}
			if(check== ch02){
				if(e.getStateChange()==ItemEvent.SELECTED){
					System.out.println("���弭�� ����");
				}else{
					System.out.println("���弭�� ����");
				}
			}
			if(check== ch03){
				if(e.getStateChange()==ItemEvent.SELECTED){
					System.out.println("���̵� ����");
				}else{
					System.out.println("���̵� ����");
				}
			}
			
			}
		}
	}

	public static void main(String[] args) {
		new CheckBoxExam();
	}

}
