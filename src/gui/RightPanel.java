package gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class RightPanel extends JPanel {

	private JTable table;
	private JTextArea textArea;

	public RightPanel() {

		textArea = new JTextArea();
		textArea.setSize(400, 600);
		add(textArea);
		setLayout(new BorderLayout());

		add(new JScrollPane(textArea), BorderLayout.CENTER);

	}

}
