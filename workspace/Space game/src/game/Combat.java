package game;

import java.util.ArrayList;

import Enemies.TestEnemy;
import game.GamePresentation;
import game.Player_charecter;

public class Combat {

	private static ArrayList<TestEnemy> Enemies;
	private static Player_charecter Player;
	private static int step = 0;
	private static int AttackType;
	private static int Enemy;
	private static TestEnemy Enemy1;
	private static TestEnemy Enemy2;
	private static TestEnemy Enemy3;
	private static TestEnemy Enemy4;
	ArrayList<String> list = new ArrayList<String>();
	private static String Text = "";
	private static boolean hitq;
	private static int Location;
	
	public Combat(){
		
	}
	
	public static void StartCombat(ArrayList<TestEnemy> NewEnemies,int NewLocation){
		
		Location = NewLocation;
		Enemies = NewEnemies;
		Player = GamePresentation.getPlayer();
		
		switch(Enemies.size()){
		case 1:
			Enemy1 = Enemies.get(0);
			break;
		case 2:
			Enemy1 = Enemies.get(0);
			Enemy2 = Enemies.get(1);
			break;
		case 3:
			Enemy1 = Enemies.get(0);
			Enemy2 = Enemies.get(1);
			Enemy3 = Enemies.get(2);
			break;
		case 4:
			Enemy1 = Enemies.get(0);
			Enemy2 = Enemies.get(1);
			Enemy3 = Enemies.get(2);
			Enemy4 = Enemies.get(3);
			break;
		}
		step = 1;
		GamePresentation.setText("You enterd combat with " + Enemies.size() + " enemies");
		GamePresentation.UpdateButtons();
		GamePresentation.UpdateTitle("Combat");
	}
	
	public ArrayList<String> ButtonText(){
		
		list.add("Attack Melee");
		list.add("Attack Ranged");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("Flee");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		
		return list;
	}
	
	public void button11(){
		switch(step){
		case 1:
			switch(Enemies.size()){
			case 1:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				list.set(1, "");
				list.set(2, "");
				list.set(3, "");
				GamePresentation.UpdateButtons();
				break;
			case 2:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				if(Enemy2.getHP() > 0){
					list.set(1, "Enemy 2");
				}else{
					list.set(1, "");
				}
				list.set(2, "");
				list.set(3, "");
				GamePresentation.UpdateButtons();
				break;
			case 3:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				if(Enemy2.getHP() > 0){
					list.set(1, "Enemy 2");
				}else{
					list.set(1, "");
				}
				if(Enemy3.getHP() > 0){
					list.set(2, "Enemy 3");
				}else{
					list.set(2, "");
				}
				list.set(3, "");
				GamePresentation.UpdateButtons();
				break;
			case 4:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				if(Enemy2.getHP() > 0){
					list.set(1, "Enemy 2");
				}else{
					list.set(1, "");
				}
				if(Enemy3.getHP() > 0){
					list.set(2, "Enemy 3");
				}else{
					list.set(2, "");
				}
				if(Enemy4.getHP() > 0){
					list.set(3, "Enemy 4");
				}else{
					list.set(3, "");
				}
				step = 1;
				GamePresentation.UpdateButtons();
				break;
			}
			list.set(7,"Back");
			GamePresentation.UpdateButtons();
			step = 2;
			AttackType = 1;
			break;
			
		case 2:
			list.set(0,"Target Left Arm");
			list.set(1,"Target Head");
			list.set(2,"Target Right Arm");
			list.set(4,"Target Left Leg");
			list.set(5,"Target Chest");
			list.set(6,"Target Right Leg");
			GamePresentation.UpdateButtons();
			Enemy = 1;
			step = 3;
			break;
		case 3:
			switch(Enemy){
			case 1:
				PlayerAttacks(Enemy1,1);
				break;
			case 2:
				PlayerAttacks(Enemy2,1);
				break;
			case 3:
				PlayerAttacks(Enemy3,1);
				break;
			case 4:
				PlayerAttacks(Enemy4,1);
				break;
			}
			
			break;
		}
	}

	public void button12(){
		switch(step){
		case 1:
			switch(Enemies.size()){
			case 1:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				list.set(1, "");
				list.set(2, "");
				list.set(3, "");
				GamePresentation.UpdateButtons();
				break;
			case 2:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				if(Enemy2.getHP() > 0){
					list.set(1, "Enemy 2");
				}else{
					list.set(1, "");
				}
				list.set(2, "");
				list.set(3, "");
				GamePresentation.UpdateButtons();
				break;
			case 3:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				if(Enemy2.getHP() > 0){
					list.set(1, "Enemy 2");
				}else{
					list.set(1, "");
				}
				if(Enemy3.getHP() > 0){
					list.set(2, "Enemy 3");
				}else{
					list.set(2, "");
				}
				list.set(3, "");
				GamePresentation.UpdateButtons();
				break;
			case 4:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				if(Enemy2.getHP() > 0){
					list.set(1, "Enemy 2");
				}else{
					list.set(1, "");
				}
				if(Enemy3.getHP() > 0){
					list.set(2, "Enemy 3");
				}else{
					list.set(2, "");
				}
				if(Enemy4.getHP() > 0){
					list.set(3, "Enemy 4");
				}else{
					list.set(3, "");
				}
				step = 1;
				GamePresentation.UpdateButtons();
				break;
			}
			list.set(7,"Back");
			GamePresentation.UpdateButtons();
			step = 2;
			AttackType = 2;
			break;
		case 2:
			list.set(0,"Target Left Arm");
			list.set(1,"Target Head");
			list.set(2,"Target Right Arm");
			list.set(4,"Target Left Leg");
			list.set(5,"Target Chest");
			list.set(6,"Target Right Leg");
			GamePresentation.UpdateButtons();
			step = 3;
			Enemy = 2;
			break;
		case 3:
			switch(Enemy){
			case 1:
				PlayerAttacks(Enemy1,2);
				break;
			case 2:
				PlayerAttacks(Enemy2,2);
				break;
			case 3:
				PlayerAttacks(Enemy3,2);
				break;
			case 4:
				PlayerAttacks(Enemy4,2);
				break;
			}
			break;
		}
	}
	
	public void button13(){
		switch(step){
		case 1:
			break;
		case 2:
			list.set(0,"Target Left Arm");
			list.set(1,"Target Head");
			list.set(2,"Target Right Arm");
			list.set(4,"Target Left Leg");
			list.set(5,"Target Chest");
			list.set(6,"Target Right Leg");
			GamePresentation.UpdateButtons();
			step = 3;
			Enemy = 3;
			break;
		case 3:
			switch(Enemy){
			case 1:
				PlayerAttacks(Enemy1,3);
				break;
			case 2:
				PlayerAttacks(Enemy2,3);
				break;
			case 3:
				PlayerAttacks(Enemy3,3);
				break;
			case 4:
				PlayerAttacks(Enemy4,3);
				break;
			}
			break;
		}
	}
	
	public void button14(){
		switch(step){
		case 1:
			break;
		case 2:
			list.set(0,"Target Left Arm");
			list.set(1,"Target Head");
			list.set(2,"Target Right Arm");
			list.set(4,"Target Left Leg");
			list.set(5,"Target Chest");
			list.set(6,"Target Right Leg");
			GamePresentation.UpdateButtons();
			step = 3;
			Enemy = 4;
			break;
		case 3:
			break;
		}
	}
	
	public void button21(){
		switch(step){
		case 1:
			break;
		case 2:
			break;
		case 3:
			switch(Enemy){
			case 1:
				PlayerAttacks(Enemy1,4);
				break;
			case 2:
				PlayerAttacks(Enemy2,4);
				break;
			case 3:
				PlayerAttacks(Enemy3,4);
				break;
			case 4:
				PlayerAttacks(Enemy4,4);
				break;
			}
			break;
		}
	}

	public void button22(){
		switch(step){
		case 1:
			break;
		case 2:
			break;
		case 3:
			switch(Enemy){
			case 1:
				PlayerAttacks(Enemy1,5);
				break;
			case 2:
				PlayerAttacks(Enemy2,5);
				break;
			case 3:
				PlayerAttacks(Enemy3,5);
				break;
			case 4:
				PlayerAttacks(Enemy4,5);
				break;
			}
			break;
		}
	}
	
	public void button23(){
		switch(step){
		case 1:
			break;
		case 2:
			break;
		case 3:
			switch(Enemy){
			case 1:
				PlayerAttacks(Enemy1,6);
				break;
			case 2:
				PlayerAttacks(Enemy2,6);
				break;
			case 3:
				PlayerAttacks(Enemy3,6);
				break;
			case 4:
				PlayerAttacks(Enemy4,6);
				break;
			}
			break;
		}
	}
	
	public void button24(){
		switch(step){
		case 1:
			int fled = GamePresentation.randInt(1, 10);
			if(fled == 1){
				GamePresentation.setLocation(Location);
				GamePresentation.UpdateButtons();
				GamePresentation.setText("You fled");
			}else{
				Text = "You tried to flee, but failed\n";
				PlayerTakeDamage();
			}
			break;
		case 2:
			step = 1;
			list.set(0, "Attack Melee");
			list.set(1, "Attack Ranged");
			list.set(2, "");
			list.set(7, "Flee");
			GamePresentation.UpdateButtons();
			break;
		case 3:
			switch(Enemies.size()){
			case 1:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				list.set(1, "");
				list.set(2, "");
				list.set(3, "");
				GamePresentation.UpdateButtons();
				break;
			case 2:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				if(Enemy2.getHP() > 0){
					list.set(1, "Enemy 2");
				}else{
					list.set(1, "");
				}
				list.set(2, "");
				list.set(3, "");
				GamePresentation.UpdateButtons();
				break;
			case 3:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				if(Enemy2.getHP() > 0){
					list.set(1, "Enemy 2");
				}else{
					list.set(1, "");
				}
				if(Enemy3.getHP() > 0){
					list.set(2, "Enemy 3");
				}else{
					list.set(2, "");
				}
				list.set(3, "");
				GamePresentation.UpdateButtons();
				break;
			case 4:
				if(Enemy1.getHP() > 0){
					list.set(0, "Enemy 1");
				}else{
					list.set(0, "");
				}
				if(Enemy2.getHP() > 0){
					list.set(1, "Enemy 2");
				}else{
					list.set(1, "");
				}
				if(Enemy3.getHP() > 0){
					list.set(2, "Enemy 3");
				}else{
					list.set(2, "");
				}
				if(Enemy4.getHP() > 0){
					list.set(3, "Enemy 4");
				}else{
					list.set(3, "");
				}
				step = 1;
				GamePresentation.UpdateButtons();
				break;
			}
			list.set(4, "");
			list.set(5, "");
			list.set(6, "");
			list.set(7,"Back");
			GamePresentation.UpdateButtons();
			step = 2;
			break;
		}
	}
	
	public void button31(){
		switch(step){
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}

	public void button32(){
		switch(step){
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}
	
	public void button33(){
		switch(step){
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}
	
	public void button34(){
		switch(step){
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}
	
	public void PlayerTakeDamage(){
		double Damage1 = 0;
		double Damage2 = 0;
		double Damage3 = 0;
		double Damage4 = 0;
		double Damagetotal = 0;
		
		if(Enemy1.getHP() > 0){
			Damage1 = EnemyAttacks(Enemy1);
			Text = Text + "The first enemy hits you for: " + Damage1 + "\n";
			switch(GamePresentation.randInt(1, 6)){
			case 1:
				Player.setLArmCnd(Player.getLArmCnd() - Damage1);
				break;
			case 2:
				Player.setHeadCnd(Player.getHeadCnd() - Damage1);
				break;
			case 3:
				Player.setRArmCnd(Player.getRArmCnd() - Damage1);
				break;
			case 4:
				Player.setLLegCnd(Player.getLLegCnd() - Damage1);
				break;
			case 5:
				Player.setChestCnd(Player.getChestCnd() - Damage1);
				break;
			case 6:
				Player.setRLegCnd(Player.getRLegCnd() - Damage1);
				break;
			}
			
		}
		if(Enemies.size() >1 && Enemy2.getHP() > 0){
			Damage2 = EnemyAttacks(Enemy2);
			Text = Text + "The second enemy hits you for: " + Damage2 + "\n";
		}
		if(Enemies.size() >2 && Enemy3.getHP() > 0){
			Damage3 = EnemyAttacks(Enemy3);
			Text = Text + "The third enemy hits you for: " + Damage3 + "\n";
		}
		if(Enemies.size() >3 && Enemy4.getHP() > 0){
			Damage4 = EnemyAttacks(Enemy4);
			Text = Text + "The fourth enemy hits you for: " + Damage4 + "\n";
		}
		
		
		Damagetotal = Damage1 + Damage2 + Damage3 + Damage4;
		Text = Text + "\nYou took a total of: " + Damagetotal;
		
		Player.setHP(Player.getHP()-Damagetotal);
		
		if(Player.getHP() <= 0 ){
			Text = Text + "\nYou died";
			GamePresentation.setLocation(1);
		}
		
		WinCheck();
		
		GamePresentation.UpdateStats();
		GamePresentation.setText(Text);
		Text = "";
		
		step = 1;
		
		list.set(0, "Attack Melee");
		list.set(1, "Attack Ranged");
		list.set(2, "");
		list.set(3, "");
		list.set(4, "");
		list.set(5, "");
		list.set(6, "");
		list.set(7, "Flee");
		GamePresentation.UpdateButtons();
	}
	
	public void PlayerAttacks(TestEnemy Enemy,int TargetLimb ){
		if(Enemy.getHP() >= 0){
			double Damage = 0;
			double hitchance =0;
			int hit = 100;
			double totalpen;
			
			if(AttackType == 1){
				totalpen = (Player.getDamagePen() / 100) - (Enemy.getResist() / 100);
				if(totalpen > 100){
					totalpen = 100;
				}
				if(totalpen < 0){
					totalpen = 0;
				}
				switch(Player.getweaponHand()){
				case 0:
					Damage = Player.getRWeaponDamage() * totalpen;
					break;
				case 1:
					Damage = Player.getLWeaponDamage() * totalpen;
					break;
				case 2:
					Damage = Player.getRWeaponDamage() + Player.getLWeaponDamage() * totalpen;
					break;
				}
				Text = Text + "You hit the first enemy and do";
				hitq = true;
			}
			
			if(AttackType == 2){
				hitchance = Player.getHitChance() - Enemy.getDodge();
				hit = GamePresentation.randInt(0,100);
				Text = Text +"You shoot at the first enemy";
				if(hit <= hitchance){
					switch(Player.getweaponHand()){
					case 0:
						Damage = Player.getRWeaponDamage();
						break;
					case 1:
						Damage = Player.getLWeaponDamage();
						break;
					case 2:
						Damage = Player.getRWeaponDamage() + Player.getLWeaponDamage();
						break;
					}
					Text = Text +" and hit for";
					hitq = true;
				}else{
					Text = Text +" and miss\n";
					hitq = false;
				}
			}
			
			if(hitq == true){
				Enemy.setHP(Enemy.getHP()-Damage);
				switch(TargetLimb){
				case 1:
					Enemy.setLArmCnd(Enemy.getLArmCnd()-Damage);
					break;
				case 2:
					Enemy.setHeadCnd(Enemy.getHeadCnd()-Damage);
					break;
				case 3:
					Enemy.setRArmCnd(Enemy.getRArmCnd()-Damage);
					break;
				case 4:
					Enemy.setLLegCnd(Enemy.getLLegCnd()-Damage);
					break;
				case 5:
					Enemy.setChestCnd(Enemy.getChestCnd()-Damage);
					break;
				case 6:
					Enemy.setRLegCnd(Enemy.getRLegCnd()-Damage);
					break;
				}
				Text =Text +" " + Damage + "\n";
			}
			PlayerTakeDamage();
		}
	}
	
	public double EnemyAttacks(TestEnemy Enemy){
		double Damage = 0;
		double totalpen = (Enemy.getDamagePen() / 100) - (Player.getResist() / 100);
		if(totalpen > 100){
			totalpen = 100;
		}
		if(totalpen < 0){
			totalpen = 0;
		}
		switch(Enemy.getweaponHand()){
		case 0:
			if(Enemy.getRArmCnd() > 0){
				Damage = Enemy.getRWeaponDamage() * totalpen;
			}else{
				Damage = (Enemy.getRWeaponDamage() * 0.5 ) * totalpen;
			}
			
			break;
		case 1:
			if(Enemy.getLArmCnd() > 0){
				Damage = Enemy.getLWeaponDamage() * totalpen;
			}else{
				Damage = (Enemy.getLWeaponDamage() * 0.5 ) * totalpen;
			}
			break;
		case 2:
			double LDamage;
			double RDamage;
			if(Enemy.getRArmCnd() > 0){
				RDamage = Enemy.getRWeaponDamage();
			}else{
				RDamage = (Enemy.getRWeaponDamage() * 0.5 );
			}
			if(Enemy.getLArmCnd() > 0){
				LDamage = Enemy.getLWeaponDamage();
			}else{
				LDamage = (Enemy.getLWeaponDamage() * 0.5 );
			}
			Damage = RDamage + LDamage * totalpen;
			break;
		}
		return Damage;
	}
	
	public void WinCheck(){
		
		switch(Enemies.size()){
		case 1:
			if(Enemy1.getHP() <= 0){
				GamePresentation.setText("You Won!");
				GamePresentation.setLocation(1);
				GamePresentation.UpdateButtons();
			}
			break;
		case 2:
			if(Enemy1.getHP() <= 0 && Enemy2.getHP() <= 0){
				GamePresentation.setText("You Won!");
				GamePresentation.setLocation(1);
				GamePresentation.UpdateButtons();
			}
			break;
		case 3:
			if(Enemy1.getHP() <= 0 && Enemy2.getHP() <= 0 && Enemy3.getHP() <= 0){
				GamePresentation.setText("You Won!");
				GamePresentation.setLocation(1);
				GamePresentation.UpdateButtons();
			}
			break;
		case 4:
			if(Enemy1.getHP() <= 0 && Enemy2.getHP() <= 0 && Enemy3.getHP() <= 0 && Enemy4.getHP() <= 0){
				GamePresentation.setText("You Won!");
				GamePresentation.setLocation(1);
				GamePresentation.UpdateButtons();
			}
			break;
		}
		
	}
	
	
	/*
	 * str = damage reduction + % våben damage der går igennem
	 * dex = dodge + hit chance
	 * int = crit chance + analyse modstaders stats (skal bruge hjælp til low lvl players så de ikke ender i fights de ikke kan klare)
	 * 
	 * target krops dele
	 * 
	 * body mods, gun mods
	 * ingen lvl men træning af stats
	 * 
	 * 
	 * din hit - obstical - modstanders dodge = slut hit chance
	 * 
	 * exempel på hvordan man starter combat:
	 * 		
	 * 		ArrayList<TestEnemy> Enemies = new ArrayList<TestEnemy>();
			TestEnemy TestEnemy1 = new TestEnemy(10,10,5,5,5,"");
			Enemies.add(TestEnemy1);
			TestEnemy TestEnemy2 = new TestEnemy(10,10,5,5,5,"");
			Enemies.add(TestEnemy2);
			TestEnemy TestEnemy3 = new TestEnemy(10,10,5,5,5,"");
			Enemies.add(TestEnemy3);
			GamePresentation.setLocation(0);
			Combat.StartCombat(Enemies,1);
	 * 
	 */
}
