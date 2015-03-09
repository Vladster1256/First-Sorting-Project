package sorting.model;

public class SortingMachine
{

	private long startTime;
	private long endTime;
	private long sortTime;
	private long endMicroTime;
	private long startMicroTime;

	
	public long getSortTime()
	{
		return sortTime;
	}
	
	public String sortTime(long sortTime)
	{
		String timeToSort = "";
		
		
		
		timeToSort += "Days: " + sortTime/(1000*60*60*24) + "\n";
		timeToSort += "Hours: " + sortTime/(1000*60*60) %24 + "\n";
		timeToSort += "Minutes: " + sortTime/(1000*60) %60 + "\n";
		timeToSort += "Seconds: " + sortTime/(1000) %60 + "\n";
		timeToSort += "Milliseconds: " + sortTime % 1000 + "\n";
		timeToSort += "Microseconds: " + (endMicroTime - startMicroTime) / 1000 + "\n";
		timeToSort += "Nanoseconds: " + (endMicroTime - startMicroTime) % 1000 + "\n";
		
		return timeToSort;
	}
	
	public int[] selectionSort(int[] toBeSorted)
	{
		int minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		startMicroTime = System.nanoTime();
		for(int position = 0; position <toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			for(int next = position +1 ; next<toBeSorted.length ; next++)
			{
				if(toBeSorted[next]<minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				swap(toBeSorted,position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		endMicroTime = System.nanoTime();
		sortTime = endTime - startTime;
		return toBeSorted;
	}
	
	public double[] selectionSort(double[] toBeSorted)
	{
		double minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		startMicroTime = System.nanoTime();
		for(int position = 0; position <toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			for(int next = position +1 ; next<toBeSorted.length ; next++)
			{
				if(toBeSorted[next]<minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				swap(toBeSorted,position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		endMicroTime = System.nanoTime();
		sortTime = endTime - startTime;
		
		return toBeSorted;
	}
	
	public CaffinatedDrink [] selectionSort(CaffinatedDrink[] unsortedFood)
	{
		CaffinatedDrink maximumCaffine;
		int maximumPosition;
		startTime = System.currentTimeMillis();
		startMicroTime = System.nanoTime();
		for(int position = 0 ; position < unsortedFood.length; position ++)
		{
			maximumPosition = position;
			maximumCaffine = unsortedFood[position];
			for(int next = position + 1; next < unsortedFood.length; next++)
			{
				if(unsortedFood[next].compareTo(maximumCaffine) > 0)
				{
					maximumCaffine = unsortedFood[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(unsortedFood,position,maximumPosition);
			}
			
		}
		endTime = System.currentTimeMillis();
		endMicroTime = System.nanoTime();
		sortTime = endTime - startTime;
		
		return unsortedFood;
	}
	
	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	private void swap(CaffinatedDrink[] array,int position, int change)
	{
		CaffinatedDrink temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	private void swap(double[] array, int position, int change)
	{
		double temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
}
