package sorting.view;

import javax.swing.JFrame;

import sorting.controller.SortingMainController;

public class SortingFrame extends JFrame
{
	private SortingPanel mainPanel;
	
	public SortingFrame(SortingMainController mainController)
	{
		mainPanel = new SortingPanel(mainController);
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setSize(600,600);
		this.setContentPane(mainPanel);
		this.setVisible(true);
		this.setResizable(true);
	}
}
