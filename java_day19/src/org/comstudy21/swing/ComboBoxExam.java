package org.comstudy21.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ComboBoxExam extends JFrame implements ListSelectionListener {
	JList list;
	JTextField tf;

	public ComboBoxExam() {
		String[] str = { "등산", "윈드서핑", "독서", "수영", "골프", "영화" };
		list = new JList(str);

		add(new JLabel("취미를 선택 하세요"), "North");
		add(list);

		tf = new JTextField();
		add(tf, "South");

		list.addListSelectionListener(this);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object[] item;
		String total = "";

		if (e.getSource() instanceof JList) {
			JList lis = (JList) e.getSource();
			item = lis.getSelectedValues();
			for (int i = 0; i < item.length; i++) {
				total = total + item[i] + " ";
			}
			tf.setText(total + "선택됨");
		}

	}

	public static void main(String[] args) {
		new ComboBoxExam();

	}
}
