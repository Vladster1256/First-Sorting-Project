package sorting.controller;

import sorting.model.SortingMachine;
import sorting.view.SortingFrame;

public class SortingMainController
{
	public SortingFrame mainFrame;
	private SortingMachine mySorter;
	private int[] wholeNumbers;
	private double[] realNumbers;
	private String[] wordage;
	
	public SortingMainController()
	{
		mainFrame = new SortingFrame(this);
		mySorter = new SortingMachine();
	}
	public void start()
	{
		fillTheArrays();
		
	}
	
	private void randomIntArray()
	{
		wholeNumbers = new int [2000000];
		for(int spot = 0; spot < wholeNumbers.length; spot++)
		{
			wholeNumbers[spot] = (int) (Math.random() * 23432);
		}
	}
	
	private void randomDoubleArray()
	{
		realNumbers = new double[20];
		for(int spot = 0; spot < realNumbers.length; spot++)
		{
			realNumbers[spot] = Math.random() * 9001;
			if(spot % 7 > 3 && spot % 9 <3)
			{
				realNumbers[spot] *= -1.0;
			}
		}
	}
	
	private void fillTheArrays()
	{
		randomIntArray();
		randomDoubleArray();
	}
	
	
	
	//Getters and Setters Below//
	public int[] getWholeNumbers()
	{
		return wholeNumbers;
	}
	public double[] getRealNumbers()
	{
		return realNumbers;
	}
	public String[] getWordage()

	{
		return wordage;
	}
	
	public SortingMachine getMySorter()
	{
		return mySorter;
	}
	public void setWholeNumbers(int[] wholeNumbers)
	{
		this.wholeNumbers = wholeNumbers;
	}
	public void setRealNumbers(double[] realNumbers)
	{
		this.realNumbers = realNumbers;
	}
	public void setWordage(String[] wordage)
	{
		this.wordage = wordage;
	}
}
