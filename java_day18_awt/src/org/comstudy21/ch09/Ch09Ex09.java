package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch09Ex09 extends MyFrame implements ActionListener{
	Button playBtn = new Button("실행");
	Button stopBtn = new Button("중단");
	Button nextBtn = new Button("Next");
	Button privBtn = new Button("Prev");

	Label label = new Label("버튼을 눌러주세요!");

	Panel panel = new Panel(new GridLayout(1, 3, 0, 5));
	Panel panel2 = new Panel(new GridLayout(2, 1, 5, 0));
	Panel center = new Panel(new GridBagLayout());

	public Ch09Ex09() {

		panel.add(playBtn);
		panel.add(stopBtn);
		panel.add(panel2);
		panel2.add(nextBtn);
		panel2.add(privBtn);
		

		this.add("South", panel);
		center.add(label);
		this.add("Center", center);
		
		play();

		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof Button){
			Button btn = (Button)e.getSource();
		System.out.println(btn.getLabel()+"버튼 눌렀습니다.");
		}
	}
		private void play(){
			playBtn.addActionListener(this);
			stopBtn.addActionListener(this);
			nextBtn.addActionListener(this);
			privBtn.addActionListener(this);
		}
	public static void main(String[] args) {

		new Ch09Ex09();
	}

}
