package java_day19_windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class management {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	DefaultTableModel tableModel;
	public management() {
		initialize();

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					management window = new management();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 697, 317);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("번호");
		lblNewLabel.setBounds(23, 50, 57, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(23, 95, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("이메일");
		lblNewLabel_2.setBounds(23, 140, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setBounds(23, 185, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(92, 92, 136, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(92, 137, 136, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(92, 182, 136, 21);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(92, 47, 136, 21);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JButton btnNewButton = new JButton("전체보기");
		btnNewButton.setBounds(121, 239, 88, 29);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("추가");
		btnNewButton_1.setBounds(221, 239, 88, 29);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("삭제");
		btnNewButton_2.setBounds(321, 239, 88, 29);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("검색");
		btnNewButton_3.setBounds(421, 239, 88, 29);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("취소");
		btnNewButton_4.setBounds(521, 239, 88, 29);
		frame.getContentPane().add(btnNewButton_4);

		table = new JTable();
		table.setBounds(243, 10, 426, 222);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(0, 0, 1, 1);
		frame.getContentPane().add(table_1);
		Object[][] data = { { "1", "Kim", "mail", "tel" }, { "2", "2222", "22", "20" }, { "김삼삼", "1111", "11", "10" } };
		String[] colums = { "번호", "이름", "이메일", "전화번호" };
		tableModel = new DefaultTableModel(data,colums);
		tableModel.setRowCount(5);
		tableModel.addTableModelListener(new TableModelListener() {
			@Override
			public void tableChanged(TableModelEvent e) {
				System.out.println(e.getSource());
			}
		});
	}
}
