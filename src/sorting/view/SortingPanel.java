package sorting.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import sorting.controller.SortingMainController;

public class SortingPanel extends JPanel
{
	private SortingMainController mainController;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	private JButton sortButton;
	private JButton searchButton;
	private JTextField inputField;
	private JTextArea displayArea;
	
	
	public SortingPanel(SortingMainController mainController)
	{
		this.mainController = mainController;
		baseLayout = new SpringLayout();
		sortButton = new JButton("Sort the stuff");
		searchButton = new JButton("Search for input");
		inputField = new JTextField(25);
		displayArea = new JTextArea(10,30);
		textPane = new JScrollPane(displayArea);
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPane()
	{
		displayArea.setLineWrap(true);
		displayArea.setWrapStyleWord(true);
		displayArea.setBackground(Color.CYAN);
		displayArea.setEditable(false); 
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.DARK_GRAY);
		this.add(sortButton);
		this.add(searchButton);
		this.add(inputField);
		this.add(textPane);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 6, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, searchButton, 25, SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.WEST, sortButton, 0, SpringLayout.WEST, textPane);
		baseLayout.putConstraint(SpringLayout.EAST, searchButton, 0, SpringLayout.EAST, textPane);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 67, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 88, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sortButton, 0, SpringLayout.NORTH, searchButton);
		
	}
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String rawArray = "";
				for(int number : mainController.getWholeNumbers())
				{
					rawArray += number + " ";
				}
				mainController.getMySorter().selectionSort(mainController.getWholeNumbers());
				rawArray += mainController.getMySorter().sortTime(mainController.getMySorter().getSortTime());
				for(int number: mainController.getWholeNumbers())
				{
					rawArray += number + " ";
				}
				displayArea.setText(rawArray);
			}
		});
	}
}
