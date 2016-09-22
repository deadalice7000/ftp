package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class LeftPanel extends JPanel {

	private JTable table;
	private NavigationPanel backAndDriverPanel;
	
	private String[] columns = { "Path", "Size", "Last Modified" };
	private File file;
	private File[] filesNames;

	private final String DIR = "C:/";

	public LeftPanel() {

		Dimension dimension = getPreferredSize();
		dimension.width = 640;
		setPreferredSize(dimension);
		setLayout(new BorderLayout());

		//CREATING COMPONENTS
		table = new JTable();
		backAndDriverPanel = new NavigationPanel();
		
		table.setAutoCreateRowSorter(true);
		table.setFocusable(false);
		table.setRowSelectionAllowed(true);

		JScrollPane tableScroll = new JScrollPane(table);

		//ADDING COMPONENTS TO PANEL
		add(tableScroll, BorderLayout.CENTER);
		add(backAndDriverPanel, BorderLayout.PAGE_START);

		createTableModel();
		

	}

	public void createTableModel() {

		// DATE FORMAT
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		file = new File(DIR);

		filesNames = file.listFiles();

		DefaultTableModel model = (DefaultTableModel) table.getModel();

		
		model.setColumnIdentifiers(columns);

		// LIST OF ROWS
		Object[] row = new Object[3];
		for (int i = 0; i < filesNames.length; i++) {
			row[0] = filesNames[i].getAbsolutePath();
			row[1] = filesNames[i].length();

			// CONVERTING FROM MILISECONDS TO NORMAL DATE
			row[2] = sdf.format(filesNames[i].lastModified());

			model.addRow(row);
		}

		// SETING EDITABLE TO FALSE
		for (int i = 0; i < table.getColumnCount(); i++) {

			Class<?> col_clas = table.getColumnClass(i);
			table.setDefaultEditor(col_clas, null);
		}

	}
}