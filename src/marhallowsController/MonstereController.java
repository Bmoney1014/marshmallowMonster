package marhallowsController;

import marshmallows.model.MarmallowMonsters;
import marshmallows.view.MarshmallowOutput;

import java.util.Scanner;
public class MonstereController
{
	private MarmallowMonsters brockMonster;
	private MarmallowMonsters userMonster;
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
		brockMonster = new MarmallowMonsters(name, eyes, noses, hair, legs, hasBellyButton);
	}
	public void start()
	{
		myOutput.displayMonsterConsole(brockMonster.toString());
		myOutput.displayMonsterGUI(brockMonster.toString());
		//this.makeUserMonster();
		myOutput.displayMonsterGUI("New Monster Info" + userMonster.toString());
		//myOutput.displayMonsterInfo("New Monster Info" + userMonster.toString());
		askQuestions();
		myOutput.displayMonsterConsole("New Monster Info" + brockMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster");
		String betterName = monsterScanner.next();
		brockMonster.setMonsterName(betterName);
		
		System.out.println("Type in a different number of eyes for the monster");
		int updatedEyes = monsterScanner.nextInt();
		brockMonster.setMonsterEyes(updatedEyes);
		
		System.out.println("Type in a different number of noses for the monster.");
		int updatedNoses = monsterScanner.nextInt();
		brockMonster.setMonsterNoses(updatedNoses);
		
		System.out.println("Type in a different amount of hair for the monster.");
		double updatedHair = monsterScanner.nextDouble();
		brockMonster.setMonsterHair(updatedHair);
		
		System.out.println("Ty in an amount of legs for the monster.");
		double updatedLegs = monsterScanner.nextDouble();
		brockMonster.setMonsterLegs(updatedLegs);
		
		System.out.println("Does it have a belly button?");
		boolean updatedBellyButtons = monsterScanner.nextBoolean();
		brockMonster.setMonsterBellyButton(updatedBellyButtons);
		
	}
		
		 /**
		  * This method will get the information to create na instance of a MarshmallowMonster.
		  */
	
		private void makeUserMonster()
		{
			//Step one: Get variables
			String userName; //Declare a String type called userName.
			int userEyes; //Declare an int type called userEyes.
			int userNoseCount; //Declare int type called userNoseCount.
			double userHair; //Declare double type called userHair.
			double userLegs; //Declare double type called userLegs.
			boolean userBellyButton; //Declare boolean type called userBellyButton.
			
			//Step two: Define variables by using Scanner to get user input.
			System.out.println("Type in your name for your monster.");
			userName = monsterScanner.next();
			System.out.println("Ty in the number of eyes for your monster.");
			userEyes = monsterScanner.nextInt();
			System.out.println("Type in the number of noses for your monster.");
			userNoseCount = monsterScanner.nextInt();
			System.out.println("Type in the number of hairs for your monster.");
			userHair = monsterScanner.nextDouble();
			System.out.println("Type in the numer of legs for your monster.");
			userLegs = monsterScanner.nextDouble();
			System.out.println("Does your monster have a belly button? True or false?");
			userBellyButton = monsterScanner.nextBoolean();
			
			//Step three: Make a monster - use the Constructor!!! Remember that order of parameters matters!
			userMonster = new MarmallowMonsters(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton);
		}
}
	
		
