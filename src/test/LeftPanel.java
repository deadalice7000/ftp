package test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class LeftPanel extends JPanel {

private JTable table;
private String[] columns ={"Path/Name","Icon","Size","Last Modified"};
private File file;
private File[] files;


	public LeftPanel() {

		Dimension dimension = getPreferredSize();
		dimension.width = 640;
		setPreferredSize(dimension);
		setLayout(new BorderLayout());
		
		table = new JTable();
		table.setAutoCreateRowSorter(true);
        table.setFocusable(false);
        table.setRowSelectionAllowed(true);
        
        JScrollPane tableScroll = new JScrollPane(table);
        
        add(tableScroll, BorderLayout.CENTER);
        
        getFilesName();
        
        
		

	}
	
	public void getFilesName(){
		
		file = new File("C:/workspace");
		files = file.listFiles();
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		model.setColumnIdentifiers(columns);
		Object[] row = new Object[1];
		for(int i=0; i<files.length; i++){
			
			row[0] = files[i];
			model.addRow(row);
		}
		
		for(int i=0; i<table.getColumnCount(); i++){
			
			Class<?> col_clas = table.getColumnClass(i);
			table.setDefaultEditor(col_clas, null);
		}
		
	}
}