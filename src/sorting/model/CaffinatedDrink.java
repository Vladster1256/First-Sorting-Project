package sorting.model;

public class CaffinatedDrink implements Comparable
{
	private String name;
	private double caffineLevel;
	private boolean isTasty;
	
	public CaffinatedDrink(String name, double caffineLevel, boolean isTasty)
	{
		this.name = name;
		this.caffineLevel = caffineLevel;
		this.isTasty = isTasty;
	}
	
	public String getName()
	{
		return name;
	}
	public double getCaffineLevel()
	{
		return caffineLevel;
	}
	public boolean isTasty()
	{
		return isTasty;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCaffineLevel(double caffineLevel)
	{
		this.caffineLevel = caffineLevel;
	}
	public void setTasty(boolean isTasty)
	{
		this.isTasty = isTasty;
	}
	
	@Override
	public String toString()
	{
		String foodInfo = "";
		
		foodInfo += "Hi, I am a caffinated object. My name is " + name;
		foodInfo += ". I have a caffine level of: " + caffineLevel;
		if(isTasty)
		{
			foodInfo += ". Vlad says I am tasty too :D.";
		}
		else
		{
			foodInfo +=". Everyone knows I taste yucky!";
		}
		return foodInfo;
	}
	
	/**
	 * 
	 */
	public int compareTo(Object comparedCaffine)
	{
		int compared = 0;
		
		if(this.caffineLevel < ((CaffinatedDrink)comparedCaffine).getCaffineLevel() || (!this.isTasty && ((CaffinatedDrink)comparedCaffine).isTasty()))
		{
			compared = -1;
		}
		else if(this.caffineLevel > ((CaffinatedDrink)comparedCaffine).getCaffineLevel()|| (this.isTasty && !((CaffinatedDrink)comparedCaffine).isTasty()))
		{
			compared = 1;
		}
		return compared;
	}
}
