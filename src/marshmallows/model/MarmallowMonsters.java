package marshmallows.model;

public class MarmallowMonsters
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;

	private MarmallowMonsters()
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
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
		}
	
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	public String toString()
	{
		String monster = "This Monster has " + monsterEyes + "eyes" + monsterNoses + "noses" + monsterName + "name" + monsterHair + "hair" + monsterLegs + "legs" + monsterBellyButton + "bellybutton";
		
		return monster;
		
	}
} 