package gui;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel {

	private JButton connectButton;
	private JButton disconnectButton;

	
	
	private Icon disconnectIcon;
	private Icon connectIcon;

	public ButtonPanel() {

		Border in = BorderFactory.createEtchedBorder();
		Border out = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(out, in));

		// ICONS
	//	disconnectIcon = new ImageIcon("icons/disconnect.png");
	//	connectIcon = new ImageIcon("icons/connect.png");
		// BUTTONS
		connectButton = new JButton("Connect...");
		disconnectButton = new JButton("Disconnect...");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		//ADDING COMPONENTS TO THE PANE
		add(connectButton);
		add(disconnectButton);

	}

}
