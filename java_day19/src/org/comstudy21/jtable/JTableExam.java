package org.comstudy21.jtable;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class JTableExam extends JFrame {

	JPanel contentPane;
	JScrollPane infoScrollPane;
	JTable searchResultTable;
	DefaultTableModel tableModel;

	public JTableExam() {
		contentPane = (JPanel) getContentPane();
		Object[][] data = { { "±Ë¿œ¿œ", "1111", "11", 30 }, { "±Ë¿Ã¿Ã", "2222", "22", 20 }, { "±ËªÔªÔ", "1111", "11", 10 } };
		String[] colums = { "º∫∏Ì", "¿Ã∏ﬁ¿œ", "¿Ã∏ﬁ¿œ", "¿¸»≠π¯»£" };
		tableModel = new DefaultTableModel(data,colums);
		searchResultTable = new JTable(tableModel);
		infoScrollPane = new JScrollPane(searchResultTable);

		tableModel.setRowCount(20);

		JTable table = searchResultTable;
//		table.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				int row =table.getSelectedRow();
//				int col = table.getSelectedColumn();
////				System.out.println(colums[col]+ ":" + data[row][col]);
//				System.out.println(Arrays.toString(data[row]));
//			}
//		});

		tableModel.addTableModelListener(new TableModelListener() {
			@Override
			public void tableChanged(TableModelEvent e) {
				System.out.println(e.getSource());

			}
		});
		contentPane.add(infoScrollPane);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JTableExam();
	}

}
