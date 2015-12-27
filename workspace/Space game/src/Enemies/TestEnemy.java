package Enemies;

public class TestEnemy {
	
	private double HP;
	private int MaxHP;
	private double Strength;
	private double Dexterity;
	private double Intellect;
	private double Resist;
	private double DamagePen;
	private double Dodge;
	private double HitChance;
	private double CritChance;
	private double RWeaponDamage = 20;
	private double LWeaponDamage = 0;
	private int weaponHand = 0;
	private String Decription;
	private double HeadCnd;
	private double HeadMaxCnd;
	private double ChestCnd;
	private double ChestMaxCnd;
	private double LArmCnd;
	private double LArmMaxCnd;
	private double RArmCnd;
	private double RArmMaxCnd;
	private double LLegCnd;
	private double LLegMaxCnd;
	private double RLegCnd;
	private double RLegMaxCnd;
	
	public TestEnemy (double HP, int MaxHP, int Strength, int Dexterity, int Intellect, String Decription){
		
		this.HP = HP;
		this.MaxHP = MaxHP;
		setStrength(Strength);
		setDexterity(Dexterity);
		setIntellect(Intellect);
		this.Decription = Decription;
		
	}
	
	public double getHP(){
		return HP;
	}
	public void setHP(double HP){
		this.HP = HP;
	}
	
	public int getMaxHP(){
		return MaxHP;
	}
	public void setMaxHP(int MaxHP){
		this.MaxHP = MaxHP;
	}
	
	public double getStrength(){
		return Strength;
	}
	public void setStrength(double Strength){
		setResist(Strength);
		setDamagePen(Strength);
		this.Strength = Strength;
	}
	
	public double getDexterity(){
		return Dexterity;
	}
	public void setDexterity(double Dexterity){
		setDodge(Dexterity);
		setHitChance(Dexterity);
		this.Dexterity = Dexterity;
	}
	
	public double getIntellect(){
		return Intellect;
	}
	public void setIntellect(double Intellect){
		setCritChance(Intellect);
		this.Intellect = Intellect;
	}
	
	public double getResist(){
		return Resist;
	}
	public void setResist(double Strength){
		this.Resist = Strength/2;
	}
	
	public double getDamagePen(){
		return DamagePen;
	}
	public void setDamagePen(double Strength){
		this.DamagePen = Strength * 2;
	}
	
	public double getDodge(){
		return Dodge;
	}
	public void setDodge(double Dexterity){
		this.Dodge = Dexterity/2;
	}
	
	public double getHitChance(){
		return HitChance;
	}
	public void setHitChance(double Dexterity){
		this.HitChance = Dexterity*2;
	}
	
	public double getCritChance(){
		return CritChance;
	}
	public void setCritChance(double Intellect){
		this.CritChance = Intellect/10;
	}
	
	public double getRWeaponDamage(){
		return RWeaponDamage;
	}
	public void setRWeaponDamage(double RWeaponDamage){
		this.RWeaponDamage = RWeaponDamage;
	}
	
	public int getweaponHand(){
		return weaponHand;
	}
	public void setweaponHand(int weaponHand){
		this.weaponHand = weaponHand;
	}
	
	public double getLWeaponDamage(){
		return LWeaponDamage;
	}
	public void setLWeaponDamage(double LWeaponDamage){
		this.LWeaponDamage = LWeaponDamage;
	}
	
	public String getDecription(){
		return Decription;
	}
	public void setDecription(String Decription){
		this.Decription = Decription;
	}
	
	public double getHeadCnd(){
		return HeadCnd;
	}
	public void setHeadCnd(double HeadCnd){
		this.HeadCnd = HeadCnd;
	}
	public double getHeadMaxCnd(){
		return HeadMaxCnd;
	}
	public void setHeadMaxCnd(double HeadMaxCnd){
		this.HeadMaxCnd = HeadMaxCnd;
	}
	
	public double getChestCnd(){
		return ChestCnd;
	}
	public void setChestCnd(double ChestCnd){
		this.ChestCnd = ChestCnd;
	}
	public double getChestMaxCnd(){
		return ChestMaxCnd;
	}
	public void setChestMaxCnd(double ChestMaxCnd){
		this.ChestMaxCnd = ChestMaxCnd;
	}
	
	public double getLArmCnd(){
		return LArmCnd;
	}
	public void setLArmCnd(double LArmCnd){
		this.LArmCnd = LArmCnd;
	}
	public double getLArmMaxCnd(){
		return LArmMaxCnd;
	}
	public void setLArmMaxCnd(double LArmMaxCnd){
		this.LArmMaxCnd = LArmMaxCnd;
	}
	
	public double getRArmCnd(){
		return RArmCnd;
	}
	public void setRArmCnd(double RArmCnd){
		this.RArmCnd = RArmCnd;
	}
	public double getRArmMaxCnd(){
		return RArmMaxCnd;
	}
	public void setRArmMaxCnd(double RArmMaxCnd){
		this.RArmMaxCnd = RArmMaxCnd;
	}
	
	public double getLLegCnd(){
		return LLegCnd;
	}
	public void setLLegCnd(double LLegCnd){
		this.LLegCnd = LLegCnd;
	}
	public double getLLegMaxCnd(){
		return LLegMaxCnd;
	}
	public void setLLegMaxCnd(double LLegMaxCnd){
		this.LLegMaxCnd = LLegMaxCnd;
	}
	
	public double getRLegCnd(){
		return RLegCnd;
	}
	public void setRLegCnd(double RLegCnd){
		this.RLegCnd = RLegCnd;
	}
	public double getRLegMaxCnd(){
		return RLegMaxCnd;
	}
	public void setRLegMaxCnd(double RLegMaxCnd){
		this.RLegMaxCnd = RLegMaxCnd;
	}
	
}
