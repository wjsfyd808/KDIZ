package org.comstudy21.view;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListView extends View {
	DefaultTableModel dm;

	public void setTablemode(DefaultTableModel dm) {
		this.dm = dm;
	}

	public ListView(DefaultTableModel dm, Object[] colnames) {
		this.dm = dm;
		dm.setColumnIdentifiers(colNames);
		init();
	}

	public void init(){ 
	JTable table = new JTable(dm);
	JScrollPane scrollPane = new JScrollPane(table);
	
	add(scrollPane);
	}

	public void start() {

	}

}
