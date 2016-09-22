package gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicArrowButton;

import javafx.scene.control.ComboBox;

public class NavigationPanel extends JPanel {

	private BasicArrowButton arrowButton;
	private JComboBox driversComboBox;

	public NavigationPanel() {

		Border in = BorderFactory.createEtchedBorder();
		Border out = BorderFactory.createEmptyBorder(3, 3, 3, 3);
		setBorder(BorderFactory.createCompoundBorder(out, in));

		arrowButton = new BasicArrowButton(1);
		driversComboBox = new JComboBox<>();

		setLayout(new FlowLayout(FlowLayout.LEFT));
	
		add(arrowButton);
		add(driversComboBox);
		
		createComboBoxModel();
	}

	public void createComboBoxModel() {

		DefaultComboBoxModel filesModel = new DefaultComboBoxModel();

		File[] roots = File.listRoots();

		for (int i = 0; i < roots.length; i++) {
			filesModel.addElement(roots[i]);
		}
		
		driversComboBox.setModel(filesModel);

	}

}
