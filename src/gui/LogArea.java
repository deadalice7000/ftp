package gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LogArea extends JPanel {

	private JTextArea textArea;

	public LogArea() {

		textArea = new JTextArea(7,1);
		textArea.setLineWrap(true);
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea), BorderLayout.CENTER);

	}

}
