package org.comstudy21.view;

import javax.swing.JPanel;

import org.comstudy21.resource.R;

public abstract class View extends JPanel implements R {
	public abstract void init(); // ���̾ƿ� ����
	public abstract void start(); // �̺�Ʈ ����

}
