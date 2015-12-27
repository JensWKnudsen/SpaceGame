package Locations;

import java.util.ArrayList;
import java.util.List;

import Enemies.TestEnemy;
import game.Combat;
import game.GamePresentation;
import game.Player_charecter;

public class StartLocation {

	ArrayList<String> list = new ArrayList<String>();
	
	int place = 1;
	
	public ArrayList<String> ButtonText(){
		
		list.add("fight");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		
		GamePresentation.UpdateTitle("Start location");
		return list;
	}
	
	
	public void button11(){
		
		switch(place){
		case 1:
			ArrayList<TestEnemy> Enemies = new ArrayList<TestEnemy>();
			TestEnemy TestEnemy1 = new TestEnemy(10,10,5,5,5,"");
			Enemies.add(TestEnemy1);
			TestEnemy TestEnemy2 = new TestEnemy(10,10,5,5,5,"");
			Enemies.add(TestEnemy2);
			TestEnemy TestEnemy3 = new TestEnemy(10,10,5,5,5,"");
			Enemies.add(TestEnemy3);
			GamePresentation.setLocation(0);
			Combat.StartCombat(Enemies,1);
			break;
		case 2:
			break;
		}
	}

	public void button12(){
		
		switch(place){
		case 1:
			break;
		case 2:
			break;
		}
	}
	
	public void button13(){
		switch(place){
		case 1:
			
			break;
		case 2:
			break;
		}
	}
	
	public void button14(){
		switch(place){
		case 1:
			
			break;
		case 2:
			break;
		}
	}
	
	public void button21(){
		switch(place){
		case 1:
			
			break;
		case 2:
			break;
		}
	}

	public void button22(){
		
	}
	
	public void button23(){
		
	}
	
	public void button24(){
		
	}
	
	public void button31(){
		
	}

	public void button32(){
		
	}
	
	public void button33(){
		
	}
	
	public void button34(){
		
	}
}
