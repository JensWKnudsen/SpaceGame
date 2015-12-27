package Locations;

import java.util.ArrayList;
import java.util.List;

import game.GamePresentation;

public class Ship {
	
	ArrayList<String> list = new ArrayList<String>();
	
	public ArrayList<String> ButtonText(){
		
		list.add("Get off your ship");
		list.add("Study");
		list.add("Meditate");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		
		return list;
	}
	
	
	public void button11(){
		GamePresentation.setLocation(1);
		GamePresentation.UpdateButtons();
		GamePresentation.setText("You get off your ship");
	}

	public void button12(){
		
		GamePresentation.getPlayer().setIntellect(GamePresentation.getPlayer().getIntellect() +1);
		GamePresentation.UpdateStats();
		GamePresentation.setText("You Study \nIntellect + 1");
	}
	
	public void button13(){
		
		GamePresentation.getPlayer().setWillpower(GamePresentation.getPlayer().getWillpower() +1);
		GamePresentation.UpdateStats();
		GamePresentation.setText("You Meditate \nWillpower + 1");
	}
	
	public void button14(){
		
	}
	
	public void button21(){
		
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
