package marshmallows.model;

public class MarmallowMonsters
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;

	public MarmallowMonsters()
	{
		
	}
	
	public MarmallowMonsters(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton)
	{

		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
		this.monsterBellyButton = monsterBellyButton;
		
	}
	
	//Getters & Setters
	public String getMonsterName()
	{
		return monsterName;
	}
	public void setMonsterName(String monsterName)
{
	this.monsterName = monsterName;
}
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	public void setMonsterEyes(int monsterEyes)
{
this.monsterEyes =monsterEyes;
}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	public void setMonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}
	public double getMonsterHair()
	{
		return monsterHair;
	}
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	public double getMonsterLegs()
	{
		return monsterLegs;
		}
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}



	
	public String toString()
	{
		String monster = "This Monster has " + monsterEyes + " eyes " + monsterNoses + " nose and his name is " + monsterName + " he has " + monsterHair + " hairs " + monsterLegs + " legs and a " + monsterBellyButton + " bellybutton ";
		
		return monster;
		
	}
} 