package Model;

public class CharacterSt 
{
private int cHP;
private int cAttack;
private int cDef;
private int cAvoid;


public CharacterSt()
{
	
}

public CharacterSt(int cHP, int cAttack, int cDef, int cAvoid)
{
	this.cHP = cHP;
	this.cAttack = cAttack;
	this.cDef = cDef;
	this.cAvoid = cAvoid;
}

public void Update(int nHP, int nAttack, int nDef, int nAvoid)
{
	setcHP( getcHP() + nHP) ;
	setcAttack( getcAttack() + nAttack) ;
	setcDef( getcDef() + nDef) ;
	setcAvoid( getcAvoid() + nAvoid) ;
}

public int getcHP() {
	return cHP;
}
public void setcHP(int cHP) {
	this.cHP = cHP;
}
public int getcAttack() {
	return cAttack;
}
public void setcAttack(int cAttack) {
	this.cAttack = cAttack;
}
public int getcDef() {
	return cDef;
}
public void setcDef(int cDef) {
	this.cDef = cDef;
}
public int getcAvoid() {
	return cAvoid;
}
public void setcAvoid(int cAvoid) {
	this.cAvoid = cAvoid;
}



}
