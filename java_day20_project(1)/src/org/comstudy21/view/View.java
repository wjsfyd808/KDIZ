package org.comstudy21.view;

import javax.swing.JPanel;

import org.comstudy21.resource.R;

public abstract class View extends JPanel implements R {
	public abstract void init(); // 레이아웃 성절
	public abstract void start(); // 이벤트 설정

}
