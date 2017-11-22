package Model;

public abstract class CharacterSt 
{
private int HP;
private int Attack;
private int Def;
private int Avoid;


public CharacterSt()
{
	
}

public CharacterSt(int HP, int Attack, int Def, int Avoid)
{
	setHP(HP);
	setAttack(Attack);
	setDef(Def);
	setAvoid(Avoid);
}

public void Update(int nHP, int nAttack, int nDef, int nAvoid)
{
	setHP( getHP() + nHP) ;
	setAttack( getAttack() + nAttack) ;
	setDef( getDef() + nDef) ;
	setAvoid( getAvoid() + nAvoid) ;
}

public int getHP() {
	return HP;
}
public void setHP(int hp) {
	HP = hp;
}
public int getAttack() {
	return Attack;
}
public void setAttack(int attack) {
	Attack = attack;
}
public int getDef() {
	return Def;
}
public void setDef(int def) {
	Def = def;
}
public int getAvoid() {
	return Avoid;
}
public void setAvoid(int avoid) {
	Avoid = avoid;
}



}
