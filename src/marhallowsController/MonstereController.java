package marhallowsController;

import marshmallows.model.MarmallowMonsters;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;
public class MonstereController
{
	private MarmallowMonsters brockMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;

	public MonstereController()
	{
		int eyes = 2;
		double legs = 6;
		double hair = 3;
		int noses = 1;
		boolean hasBellyButton = true;
		String name = "Bobby";
		
	monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		brockMonster = new MarmallowMonsters(name, eyes, noses, hair, legs,hasBellyButton);
	}
	public void start()
	{
		myOutput.displayMonsterInfo(brockMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info" + brockMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		brockMonster.setMonsterName(betterMonsterName);
		System.out.println("Type in a different number of eyes for the monster");
		
	}

	
}