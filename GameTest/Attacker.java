package GameTest;

public class Attacker extends Character {
	public double swordDameged;
	Attacker(String a, double b, double c)
	{
		super(a,b);
		this.swordDameged= c;
	}
	public double damagedCaculate() {
		return this.swordDameged + super.baseDamaged;
	}
	public void attack()
	{
		System.out.println(super.name+ " is slamming monster with a word. Caused "+ this.damagedCaculate());
	}
}
