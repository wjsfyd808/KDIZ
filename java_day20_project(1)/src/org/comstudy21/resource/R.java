package org.comstudy21.resource;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.comstudy21.controller.InputController;
import org.comstudy21.controller.ListController;
import org.comstudy21.model.Dao;
import org.comstudy21.view.ListView;

public interface R {
	DefaultTableModel dm = new DefaultTableModel(10,4);
	Object[] colNames = {"��ȣ","�̸�","�̸���","��ȭ��ȣ"};
	ListView listView = new ListView(dm,colNames);
	
	JTextField nameField = new JTextField(15);
	JTextField emailField = new JTextField(15);
	JTextField phoneField = new JTextField(15);
	
	ListController listController = new ListController();
	InputController inputController = new InputController();
	
	Dao dao = new Dao();
	
	
}
