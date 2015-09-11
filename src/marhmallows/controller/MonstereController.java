package marhmallows.controller;

import marshmallows.model.MarmallowMonsters;
import marshmallows.view.MarshmallowOutput;
public class MonstereController
{
	private MarmallowMonsters brockMonster;
	private MarshmallowOutput myOutput;

	public MonstereController()
	{
		int eyes = 2;
		double legs = 6;
		double hair = 3;
		int noses = 1;
		boolean hasBellyButton = true;
		String name = "Bobby";
		
		brockMonster = new MarmallowMonsters(name, eyes, noses, hair, legs,hasBellyButton);
	}
	public void start()
	{
		 
	}

}