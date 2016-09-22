package gui;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel {

	private JButton connectButton;
	private JButton disconnectButton;
	
	public ButtonPanel(){
	
		
		Border in = BorderFactory.createEtchedBorder();
		Border out = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(out,in));
		
		//BUTTONS
		connectButton = new JButton("Connect");
		disconnectButton = new JButton("Disconnect");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(connectButton);
		add(disconnectButton);
		
	}
	
}
