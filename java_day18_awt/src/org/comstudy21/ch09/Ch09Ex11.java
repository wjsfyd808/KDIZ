package org.comstudy21.ch09;

import java.awt.ActiveEvent;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonHandler implements ActionListener {
	public ButtonHandler() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof Button) {
			Button btn = (Button) e.getSource();
			System.out.println(btn.getLabel() + "버튼 눌렀습니다.");
		}
	}
}

public class Ch09Ex11 extends MyFrame implements ActionListener {
	GridBagConstraints Gg = new GridBagConstraints();
	Button persent = new Button(" % ");
	Button reset = new Button(" C ");
	Button delete = new Button(" [X] ");
	Button plus = new Button(" + ");
	Button seven = new Button(" 7 ");
	Button eight = new Button(" 8 ");
	Button nine = new Button(" 9 ");
	Button minus = new Button(" - ");
	Button four = new Button(" 4 ");
	Button five = new Button(" 5 ");
	Button six = new Button(" 6 ");
	Button multiply = new Button(" * ");
	Button one = new Button(" 1 ");
	Button two = new Button(" 2 ");
	Button three = new Button(" 3 ");
	Button divis = new Button(" / ");
	Button zero = new Button(" 0 ");
	Button comma = new Button(" . ");
	Button result = new Button(" = ");
	Label label = new Label("     0     ");
	Panel panel = new Panel(new GridLayout(5, 4, 5, 5));
	Panel panle = new Panel(new GridBagLayout());
	Panel tfpanel = new Panel();
	TextField tf = new TextField("", 100);

	public Ch09Ex11() {
		panel.add(persent);
		panel.add(reset);
		panel.add(delete);
		panel.add(plus);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(minus);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(multiply);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(divis);
		panel.add(zero);
		panel.add(comma);
		panel.add(result);
		this.add("North", tf);
		tf.setEditable(false);
		tf.setBackground(Color.WHITE);
		this.add("Center", panel);
		play();
		setVisible(true);
	}

	private void play() {
		ButtonHandler handler = new ButtonHandler();
		// playBtn.addActionListener(handler);
		// stopBtn.addActionListener(handler);
	}

	public static void main(String[] args) {

		new Ch09Ex11();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
