package grid.view;

import javax.swing.*;
import grid.view.GridFrame;
import java.awt.Color;
import grid.controller.GridController;
import java.awt.Dimension;

public class GridPanel extends JPanel
{
	private GridController baseController;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JTextField columnField;
	private JTextField rowField;
	private JTextField somethingElseField;
	private JTable tableThing;
	
	public GridPanel(GridController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = baseLayout;
		this.columnField = new JTextField(5);
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupTable()
	{
		DefaultTableModel data = new DefalutTableModel(baseController.getGrid(), new String []{"one","two","three","four","five"});
	}
	
	
}

