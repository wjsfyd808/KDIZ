package org.comstudy21.evt_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.comstudy21.resource.R;
import org.comstudy21.view.ButtonView;

public class BtnEvtHandler implements ActionListener, R {
	ButtonView target;

	public BtnEvtHandler(ButtonView target) {
		this.target = target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();
			if (btn == target.allBtn) {
				//System.out.println("전체보기 ...");
				listController.service();
			}
			if (btn == target.inputBtn) {
				//System.out.println("입력 ...");
				inputController.service();
				listController.service();
			}
			if (btn == target.deleteBtn) {
				System.out.println("삭제 ...");
			}
			if (btn == target.searchBtn) {
				System.out.println("검색 ...");
			}
			if (btn == target.cancelBtn) {
				System.out.println("취소 ...");
			}
		}
	}
}
