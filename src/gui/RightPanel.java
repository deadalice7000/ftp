package gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RightPanel extends JPanel {

	private JTextArea textArea;
	
	public RightPanel() {

		textArea = new JTextArea();

		add(textArea);
		setLayout(new BorderLayout());

		add(new JScrollPane(textArea), BorderLayout.CENTER);

	}

}
