package lab11;

abstract class ClassicTank {
	
	public int HP;
	public int Str;
	public int Vit;
	public int BaseDamage;
	
	public abstract void SetHP(int x);
	public abstract void GetHP(); 
	public abstract void Attack(int x);
 
}//end abstract class
