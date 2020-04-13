package org.comstudy21.controller;

import java.util.Vector;

public class ListController implements Controller {

	public ListController() {
	}

	@Override
	public void service() {
		Vector<Vector> dataList = dao.selectAll();

		if (dataList != null) {
			while (dm.getRowCount() > 0) {
				dm.removeRow(0);
			}
			for (Vector rowData : dataList) {
				dm.addRow(rowData);
			}
		}
	}

	public void test() {
		Vector rowData = new Vector<>();
		rowData.add("0");
		rowData.add("test");
		rowData.add("test@mail.net");
		rowData.add("010-1111-2222");
		dm.addRow(rowData);

		while (dm.getRowCount() > 0) {
			dm.removeRow(0);
		}
		dm.addRow(rowData);
	}

}
