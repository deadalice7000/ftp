package gui;

import javax.swing.JPanel;
import javax.swing.JTable;

public class RightPanel extends JPanel {

	private JTable table;
	
	public RightPanel(){
		
		table = new JTable();
		add(table);
		
	}
	
}
