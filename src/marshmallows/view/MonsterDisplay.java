package marshmallows.view;
import javax.swing.JOptionPane;

import marshmallows.model.MarmallowMonsters;
import marhallowsController.MonstereController;

import java.util.Scanner;

public class MonsterDisplay
{
private MonsterDisplay userInformation;
private Scanner monsterScanner;
private MonsterDisplay userOutput;
private MonsterDisplay userMonster;
private MonsterDisplay monster;
{
	{
monsterScanner = new Scanner(System.in);
userMonster = new MonsterDisplay(System.out);
userOutput = new Output(System.out);
	}


//Getters and setters

public void monsterPopUp()
{
/**
 * A PopUp display of the marshmallow monster project.
 * @author Brock Hostetter
 * @param info
 */
monsterScanner = new Scanner(System.in);
}
public void displayMonsterConsole(String info)
{
	System.out.println("My monster info is " + info);
}

public void displayMonsterGUI(String info)
{
	JOptionPane.showMessageDialog(null, "Your monster information is");
}
public void showResponse(String wordsFromNowhere)
{
	JOptionPane.showMessageDialog(null,  wordsFromNowhere);
}

public String grabAnswer(String stuff)
{
	String answer = "";
	
	answer = JOptionPane.showInputDialog(null, stuff);
			
			return answer;
	}
public class MonstereController
{
}
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
	monsterScanner = new Scanner(System.in);
	
	userMonster = new MonsterDisplay();
	monster = new MonsterDisplay(name, eyes, noses, hair, legs, hasBellyButton);
}
}


