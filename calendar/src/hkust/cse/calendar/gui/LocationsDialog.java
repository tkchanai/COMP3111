package hkust.cse.calendar.gui;

import hkust.cse.calendar.apptstorage.ApptStorageControllerImpl;
import hkust.cse.calendar.apptstorage.ApptStorageNullImpl;
import hkust.cse.calendar.unit.Appt;
import hkust.cse.calendar.unit.Location;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;


public class LocationsDialog extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private ApptStorageControllerImpl _controller;
	
	private DefaultListModel<Location> listModel;
	private JList<Location> list;
	private JTextField locNameText;
	private JButton _add;
	private JButton _delete;
	public LocationsDialog(ApptStorageControllerImpl controller){
		
		_controller =controller;
		Location[] z=controller.getLocationList();
		this.setLayout(new BorderLayout());
		this.setLocationByPlatform(true);
		this.setSize(300,200);
		
		listModel = new DefaultListModel<Location>();
		
		list = new JList<Location>(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.add(new JScrollPane(list),BorderLayout.NORTH);
		
		locNameText= new JTextField(10);
		this.add(locNameText,BorderLayout.WEST);
		
		_add = new JButton("add");
		this.add(_add,BorderLayout.CENTER);
		
		_delete = new JButton("delete");
		this.add(_delete,BorderLayout.EAST);
		list.setSelectedIndex(0);
		list.addListSelectionListener(new ListSelectionListener(){
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				
				
				}
			}
		);
		
	}
}
