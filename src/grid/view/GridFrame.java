package grid.view;

import javax.swing.JFrame;
import grid.controller.GridController;
import java.awt.Dimension;
import grid.view.GridPanel;

public class GridFrame extends JFrame 
{
	private GridController baseController;
	private GridPanel basePanel;
	
	public GridFrame(GridController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new GridPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Tic-Tac-Toe");
		this.setSize(new Dimension(900,600));
		this.setResizable(false);
		this.setVisible(true);
	}
}
